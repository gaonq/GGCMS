package com.gaonq.aspect;

import com.gaonq.entity.Employee;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Web层日志切面
 * Created by gaonq on 2018/1/16.
 * 实现AOP的切面主要有以下几个要素：
 ·        使用@Aspect注解将一个java类定义为切面类
 ·        使用@Pointcut定义一个切入点，可以是一个规则表达式，比如下例中某个package下的所有函数，也可以是一个注解等。
 ·        根据需要在切入点不同位置的切入内容
 o   使用@Before在切入点开始处切入内容
 o   使用@After在切入点结尾处切入内容
 o   使用@AfterReturning在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
 o   使用@Around在切入点前后切入内容，并自己控制何时执行切入点自身的内容
 o   使用@AfterThrowing用来处理当切入内容部分抛出异常之后的处理逻辑。
 */
@Aspect
@Component
/*
 >在切入点前的操作，按order的值由小到大执行
 >在切入点后的操作，按order的值由大到小执行
 在实际中order值可以设置为负值，确保是第一个进行执行的。
 */
@Order(-99)//@Order(-99) // 控制多个Aspect的执行顺序，越小越先执行
public class webLogAspect {
    ThreadLocal<Long> startTime =new ThreadLocal<Long>();
    private static final Logger log = Logger.getLogger(webLogAspect.class);
    /**
     * 定义一个切入点.
     * 解释下：
     *
     * ~ 第一个 * 代表任意修饰符及任意返回值.
     * ~ 第二个 * 任意包名
     * ~ 第三个 * 代表任意方法.
     * ~ 第四个 * 定义在web包或者子包
     * ~ 第五个 * 任意方法
     * ~ .. 匹配任意数量的参数.
     */
    @Pointcut("execution(public * com.gaonq.controller..*.*(..))")
    public void webLog(){}

    //每一个实现类的每一个方法开始之前执行
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        startTime.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        log.info("WebLogAspect.doBefore()");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();


        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
        //获取所有参数方法一：
        Enumeration<String> enu=request.getParameterNames();
        while(enu.hasMoreElements()){
            String paraName=(String)enu.nextElement();
            System.out.println(paraName+": "+request.getParameter(paraName));
        }
    }
    //每一个实现类的每一个方法执行之后执行
    //无论该方法是否出现异常
    @After("webLog()")
    public void doAfter()
    {
        log.info("执行了doAfter");
    }
    //方法正常结束后执行的代码
    //返回通知是可以访问到方法的返回值的
    @AfterReturning(value="webLog()", returning="rtv")
    public void doReturning(JoinPoint jp, Object rtv)
    {
        Signature signature = jp.getSignature();
        log.info("DeclaringType:" + signature.getDeclaringType());
        log.info("DeclaringTypeName:" + signature.getDeclaringTypeName());
        log.info("Modifiers:" + signature.getModifiers());
        log.info("Name:" + signature.getName());
        log.info("LongString:" + signature.toLongString());
        log.info("ShortString:" + signature.toShortString());

        for (int i = 0; i < jp.getArgs().length; i++) {
            Object arg = jp.getArgs()[i];
            if(null != arg) {
                log.info("Args:" + arg.toString());
            }
        }
        log.info("Return:" + rtv);
        log.info("耗时（毫秒） : " + (System.currentTimeMillis()-startTime.get()));
    }
    //在方法出现异常时会执行的代码
    //可以访问到异常对象，可以指定在出现特定异常时在执行通知代码
    @AfterThrowing(value="webLog()",throwing = "ex")
    public void doException(JoinPoint joinPoint, Exception ex)
    {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " occurs exception: " + ex);
    }
    //环绕通知需要携带ProceedingJoinPoint类型的参数
    //环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
    //而且环绕通知必须有返回值，返回值即为目标方法的返回值
    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint jp) {
        System.out.println("执行目标方法之前，模拟开始事务...");
        // 获取目标方法原始的调用参数
        Object[] args = jp.getArgs();
        if(args != null && args.length >= 1)
        {
            System.out.println("执行目标方法之前，args[0] = " +args[0]);
            // 修改目标方法的第一个参数
            args[0] = 28910;// Integer.parseInt("1") + Integer.parseInt(args[0].toString());
        }
        System.out.println("执行目标方法之前，修改了参数，args[0] = " +args[0]);
        // 以改变后的参数去执行目标方法，并保存目标方法执行后的返回值
        Object rvt = null;
        try {
            rvt = jp.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("执行目标方法异常...");
        }
        System.out.println("执行目标方法之后，模拟结束事务...");
        Employee employee;
        // 如果rvt的类型是Integer，将rvt改为它的平方
        if(rvt != null && rvt instanceof Integer)
            rvt = (Integer)rvt * (Integer)rvt;
        else
        {
            rvt = rvt;
            employee = (Employee)rvt;
            employee.setAccountname("汽车之家");
            rvt = employee;
        }
        return rvt;
    }
}
