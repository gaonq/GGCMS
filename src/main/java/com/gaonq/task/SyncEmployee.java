package com.gaonq.task;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gaonq on 2018/1/16.
 */
@Component
public class SyncEmployee {
    private static final Logger log = Logger.getLogger(SyncEmployee.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    //每5秒执行一次
    //    CRON表达式    含义
    //    "0 0 12 * * ?"    每天中午十二点触发
    //    "0 15 10 ? * *"    每天早上10：15触发
    //    "0 15 10 * * ?"    每天早上10：15触发
    //    "0 15 10 * * ? *"    每天早上10：15触发
    //    "0 15 10 * * ? 2005"    2005年的每天早上10：15触发
    //    "0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发
    //    "0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发
    //    "0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发
    //    "0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发
    //    "0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发
    //    "0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发
    //    @Scheduled 参数可以接受两种定时的设置，一种是我们常用的cron="*/6 * * * * ?",一种是 fixedRate = 6000，两种都表示每隔六秒打印一下内容。
    //
    //    fixedRate 说明
    //
    //    @Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后6秒再执行
    //    @Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后6秒再执行
    //    @Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次
//    @Scheduled(cron = "2 * * * * ?")
    @Scheduled(initialDelay = 1000,fixedDelay = 5000000)
    public void SyncJoinEmployeeTask()
    {
        log.info("同步人员成功"+ dateFormat.format(new Date()));
    }
}
