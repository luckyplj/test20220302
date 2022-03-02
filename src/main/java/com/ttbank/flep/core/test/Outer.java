package com.ttbank.flep.core.test;

/**
 * @Author lucky
 * @Date 2022/1/26 9:16
 */
public class Outer {
    //定义一个实例变量和一个静态变量
    private int a=1;
    private static int b=2;
    //定义一个静态方法
    public static void say(){
        System.out.println("这是Outer.say方法");
    }
    //定义一个非静态方法
    public void test(){
        //在外部类中调用内部类的属性和方法
        Outer.Inner.c = 5;            //可以通过静态内部类的全类名来调用静态内部类的静态属性（外部类名.静态内部类名.属性）
        Outer.Inner.go();            //可以通过静态内部类的全类名来调用静态内部类的静态方法（外部类名.静态内部类名.方法）
        //Outer.Inner.walk();        //不能通过类静态内部类的全类名来调用内部类的非静态属性和方法
        Inner inner = new Inner();
        inner.d = 6;
        inner.sing();                    //可以通过创建内部类实例来调用静态内部类的非静态属性和方法
    }

    public void test1(){
        System.out.println("这是Outer的非静态方法test1方法");
    }
    //静态内部类
    public static class Inner{
        //在静态内部类中定义一个静态变量和一个实例变量
        static int c=3;
        int d=4;

        //定义一个匿名代码块
        {}
        //定义一个静态代码块
        static{}

        //定义一个静态方法和一个普通方法
        public static void go(){}
        public void walk(){
            //01 在静态内部类中调用外部类的属性和方法
            int f = b;
            System.out.println("内部类普通方法直接调用外部类的静态属性:"+f);
            say();                         //内部类普通方法直接调用外部类的静态方法

            //int e = a;                   //内部类普通方法直接调用外部类的非静态属性出错编译出错
            //test();                      //内部类普通方法直接调用外部类的非静态方法时编译出错
            System.out.println("内部类可以通过创建外部类实例来调用外部类的非静态属性和方法");
            Outer outer = new Outer();
            int e = outer.a;
            System.out.println("内部类可以通过创建外部类实例来调用外部类的非静态属性："+e);
            outer.test1();              //可以通过创建外部类实例来调用外部类的非静态方法
        }

        public void sing(){
            System.out.println("这是Inner类的非静态方法sing");
        }
    }
}
