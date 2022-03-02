package com.ttbank.flep.core.test;

/**
 * @Author lucky
 * @Date 2022/1/19 15:14
 */
public class Child extends Father{
    //func1(int i)是对func1()方法的一个重载，主要不是重写！
    //由于在父类中没有定义这个方法，所以它不能被父类类型的引用调用, 所以在下面的main方法中father.func1(68)是不对的
    public void func1(int i){
        System.out.println("DDD");
    }

    //func2()重写了父类Father中的func2()方法
    //如果父类类型的引用中调用了func2()方法，那么必然是子类中重写的这个方法
    public void func2(){
        System.out.println("I am Child'method func1: BBB");
    }

    public static void main(String[] args) {
        //多态的测试
        Father father = new Child();
        father.func1();//子类没有重写父类方法，则调用的是父类方法func1
        father.func2();//子类重写了父类方法，则调用的是子类方法func2
        Father father1 = new Father();
        father1.func2();
        //father.func1(68);
    }
}
