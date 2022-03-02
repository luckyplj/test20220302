package com.ttbank.flep.core.entity;

/**
 * @Author lucky
 * @Date 2021/12/28 16:30
 */
public class Teacher {
    //---------------构造方法-------------------
    //（默认的构造方法）
    Teacher(String str){
        System.out.println("(默认)的构造方法 s = " + str);
    }

    //无参构造方法
    public Teacher(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public Teacher(char name){
        System.out.println("姓名：" + name);
    }

    //有多个参数的构造方法
    public Teacher(String name ,int age){
        System.out.println("姓名："+name+"年龄："+ age);//这的执行效率有问题，以后解决。
    }

    //受保护的构造方法
    protected Teacher(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private Teacher(int age) {
        System.out.println("私有的构造方法   年龄：" + age);

    }

    public void sayHello(){
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "Teacher{}";
    }
}
