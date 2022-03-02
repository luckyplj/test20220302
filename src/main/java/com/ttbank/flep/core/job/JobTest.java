package com.ttbank.flep.core.job;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Author lucky
 * @Date 2021/12/27 9:23
 */
public class JobTest {
    public static void job() {

        // 创建工厂
        SchedulerFactory schedulerfactory = new StdSchedulerFactory();
        Scheduler scheduler = null;
        try {
            // 通过schedulerFactory获取一个调度器
            scheduler = schedulerfactory.getScheduler();

            JobDataMap jobDataMap=new JobDataMap();
            jobDataMap.put("name","quartz" );


            // 创建一个JobDetail实例，指明job的名称，所在组的名称，以及绑定job类
            JobDetail job = JobBuilder.newJob(HelloJob.class) //绑定job类
                    .withIdentity("JobName", "JobGroupName") //指定JobDetail的名称和组名称
                    .usingJobData(jobDataMap) //使用jobDataMap存储用户数据, jobDataMap为JobDetail传递的文本数据
                    .build();
            // 构建一个Trigger(定义触发的条件)，指定Trigger名称和组，规定该Job立即执行，且3秒钟重复执行一次
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("CronTrigger1", "CronTriggerGroup") //指定Trigger名称和组
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3).repeatForever()) // 设置运行规则，每隔3秒执行一次，一直重复下去
                    .startNow() // 执行的时机，立即执行
                    .build();

            //绑定JobDetail和Trigger
            scheduler.scheduleJob(job, trigger);

            //开始任务调度
            scheduler.start();

            Thread.sleep(30000);

            // 停止任务调度
            scheduler.shutdown();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
