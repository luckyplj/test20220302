package com.ttbank.flep.core.job;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author lucky
 * @Date 2022/1/27 10:37
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledTasks {

    /**
     * 每6秒执行一次
     **/
    @Scheduled(cron = "*/6 * *  * * * ")
    public void reportCurrentByCron(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + sdf.format (new Date()));
    }

}
