package com.ttbank.flep.core.test;

/**
 * @Author lucky
 * @Date 2022/1/19 15:12
 */
public class Father {
    public void func1(){
        System.out.println("I am Father'method func1: AAA");
    }
    //这是父类中的func2()方法，因为下面的子类中重写了该方法,所以在父类类型的引用中调用时，这个方法将不再有效
    //取而代之的是将调用子类中重写的func2()方法
    public void func2(){
        func3();
    }

    public void func3(){
        System.out.println("I am Father'method func3: CCC");
    }
}
