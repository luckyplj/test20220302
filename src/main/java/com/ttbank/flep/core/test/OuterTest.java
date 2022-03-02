package com.ttbank.flep.core.test;

/**
 * @Author lucky
 * @Date 2022/1/26 9:28
 */
public class OuterTest {
    public static void main(String[] args) {
        /*
         * 要想访问静态内部类的实例成员，需先创建实例对象，才可以调用，因为实例成员是属于实例的， 创建方法：外部类名.内部类名 name = new
         * 外部类名.内部类名()
         * 通过“ 外部类.内部类.属性（方法）” 的方式直接调用静态内部类中的静态属性和方法
         */
        System.out.println("------------------------------------------------------");
        Outer.Inner inner=new Outer.Inner();
        inner.walk();
        System.out.println("通过“ 外部类.内部类.属性（方法）” 的方式直接调用静态内部类中的静态属性:"+inner.d);

        System.out.println("-------------------------------------------------------");
        Outer outer=new Outer();
        outer.test();
    }
}
