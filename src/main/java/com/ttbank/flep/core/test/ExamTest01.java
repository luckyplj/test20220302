package com.ttbank.flep.core.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lucky
 * @Date 2022/1/21 10:10
 */
public class ExamTest01 {
    static class A{

    }

    static class B extends A{}

    public static void main(String[] args) {
        ArrayList<A> list=new ArrayList<A>();
        list.add(new B());
        method1(list);
    }

    private static void method1(List<? extends A> list) {
        for (int i = 0; i < list.size(); i++) {
            A a=list.get(0);
        }
    }
}
