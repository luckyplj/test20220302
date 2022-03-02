package com.ttbank.flep.core.test;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;

/**
 * @Author lucky
 * @Date 2021/12/27 9:15
 */
public class JobTest {
//    public static void main(String[] args) {
//        JobDetail jobDetail=JobBuilder.newJob(HelloJob.class).
//                withIdentity("myJob", "group1")
//                .build();
//    }

    public static void main(String[] args) {
        System.out.println(Character.isLetterOrDigit('A')); //true
        System.out.println(Character.isLetterOrDigit('1')); //false
    }
}
