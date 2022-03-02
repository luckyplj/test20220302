package com.ttbank.flep.core.test;

/**
 * @Author lucky
 * @Date 2022/1/19 11:22
 */
public class SubClass extends SuperClass {
    int num = 10;
    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void my_method() {
        // 01 实例化子类
        SubClass sub = new SubClass();
        // 02 调用子类的display方法
        sub.display();
        // 03 调用父类的display方法
        super.display();
        // 04 打印子类的num值
        System.out.println("value of the variable named num in sub class:"+ sub.num);
        // 05 打印父类的num值
        System.out.println("value of the variable named num in super class:"+ super.num);
    }
    public static void main(String args[]) {
        SubClass obj = new SubClass();
        obj.my_method();
    }
}
