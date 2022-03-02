package com.ttbank.flep.core.controller;


import com.ttbank.flep.core.aspect.ExecuteTime;
import com.ttbank.flep.core.job.JobTest;
//import com.ttbank.flep.core.service.IStudentService;
import com.ttbank.flep.core.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lucky
 * @since 2021-11-25
 */
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @PostMapping("/getStudentName")
    @ExecuteTime
    public void getStudentName(){
        log.info("studentName:lucky");
        Random random=new Random();
        int sleepTime = random.nextInt(10000);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/insert")
    public void insertOne(){
        studentService.insertOneStu();
    }

    @RequestMapping("/test")
    public void test(){
        //String property = System.getProperty("user.home");
        JobTest.job();
    }

    @RequestMapping("/dateFormat")
    public void getDateFormat(String createDate){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        try {
            Date beginDate=sdf.parse(createDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
