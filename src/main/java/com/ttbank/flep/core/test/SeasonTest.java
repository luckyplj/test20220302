package com.ttbank.flep.core.test;

import com.alibaba.fastjson.JSONObject;
import com.ttbank.flep.core.entity.Animal;
import com.ttbank.flep.core.entity.Person;

/**
 * @Author lucky
 * @Date 2022/1/20 14:00
 */
public class SeasonTest {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.setAge("12");
        animal.setName("peter");
        animal.setAddress("tiantai");
        System.out.println("age:"+animal.getAge());
        System.out.println(animal.getNameAndAge());
        System.out.println("address:"+animal.address); //通过类的对象访问类的公有成员变量(public修饰)
//        System.out.println(animal.name);
//
//        animal.eat();
    }
}
