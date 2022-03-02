package com.ttbank.flep.core.test;

import com.ttbank.flep.core.entity.Person;
import com.ttbank.flep.core.entity.Singer;

/**
 * @Author lucky
 * @Date 2022/1/19 9:21
 */
public class ExtendTest {
    public void sing(Person person){
        System.out.println("I am singing");
        System.out.println("I am listening");

    }

    public static void main(String[] args) {
        Singer singer=new Singer();
        singer.setAge("25");
        singer.setAddress("tiantai");
        ExtendTest extendTest=new ExtendTest();
        extendTest.sing(singer);
    }
}
