package com.gaonq.controller;

import com.gaonq.entity.Employee;
import com.gaonq.service.impl.EmployeeService;
import com.gaonq.util.EmailServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaonq on 2018/1/16.
 */
@RestController
public class HomeController {

    private static final Logger log = Logger.getLogger(HomeController.class);
    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmailServiceImpl emailService;

    @GetMapping("/index")
    public String index()
    {
        return "首页";
    }

    @GetMapping("/selectByPrimaryKey/{key}")
    public Employee selectByPrimaryKey(@PathVariable("key") Integer key)
    {

        Employee  employee = employeeService.selectByPrimaryKey(key);
        log.info("key = "+ employee);
        return employee;
    }
    @GetMapping("/sendMail")
    public  String sendEmail(String sendTo)
    {
        if(sendTo == null && sendTo.equals("")){
            return "邮箱错误";
        }
        emailService.sendSimpleMail(sendTo,"测试邮件","测试邮件由springboot发送");
        return "发送成功";
    }
}
