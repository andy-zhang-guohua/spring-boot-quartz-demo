package com.kaviddiss.bootquartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 此类用于演示 SpringBoot自带的Scheduled，可以将它看成一个轻量级的Quartz，而且使用起来比Quartz简单许多
 * <p>
 * Created by ZhangGuohua on 2017/7/25.
 */
@Component
public class SpringScheduled {
    private static final Logger logger = LoggerFactory.getLogger(SpringScheduled.class);

    @Scheduled(cron = "0 0/2 8-20 * * ?")
    public void executeFileDownLoadTask() {

        // 间隔2分钟,执行工单上传任务
        Thread current = Thread.currentThread();
        System.out.println("定时任务1:" + current.getId());
        logger.info("ScheduledTest.executeFileDownLoadTask 定时任务1:" + current.getId() + ",name:" + current.getName());
    }

    @Scheduled(cron = "0 0/1 8-20 * * ?")
    public void executeUploadTask() {

        // 间隔1分钟,执行工单上传任务
        Thread current = Thread.currentThread();
        System.out.println("定时任务2:" + current.getId());
        logger.info("ScheduledTest.executeUploadTask 定时任务2:" + current.getId() + ",name:" + current.getName());
    }

    @Scheduled(cron = "0 0/3 5-23 * * ?")
    public void executeUploadBackTask() {

        // 间隔3分钟,执行工单上传任务
        Thread current = Thread.currentThread();
        System.out.println("定时任务3:" + current.getId());
        logger.info("ScheduledTest.executeUploadBackTask 定时任务3:" + current.getId() + ",name:" + current.getName());
    }
}
