package com.ttbank.flep.core.test;

import com.ttbank.flep.core.entity.Teacher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author lucky
 * @Date 2021/12/28 16:35
 */
public class ConstructorTest {
    public static void test() throws Exception {
        //1.加载Class对象
        Class clazz = Class.forName("com.ttbank.flep.core.entity.Teacher");


        //2.获取所有公有构造方法
        System.out.println("**********************所有公有构造方法*********************************");
        Constructor[] conArray = clazz.getConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }


        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        conArray = clazz.getDeclaredConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor con = clazz.getConstructor(null);
        //1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型，切记是类型
        //2>、返回的是描述这个无参构造函数的类对象。

        System.out.println("con = " + con);
        //调用构造方法
        Object obj = con.newInstance();
        //	System.out.println("obj = " + obj);
        //	Student stu = (Student)obj;

        System.out.println("******************获取私有构造方法，并调用*******************************");
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);//暴力访问(忽略掉访问修饰符)
        obj = con.newInstance('男');
    }

    public static void main(String[] args) {
        try {
            //01 获取Class对象
            Class<?> teacherClass = Class.forName("com.ttbank.flep.core.entity.Teacher");
            //02 获取构造方法
            Constructor<?> constructor = teacherClass.getConstructor(String.class,int.class);
            //03 利用构造方法创建声明类Teacher的新实例
            Teacher teacher = (Teacher) constructor.newInstance("lucky", 25);
            teacher.sayHello();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
