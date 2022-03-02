package com.ttbank.flep.core.test;

/**
 * @Author lucky
 * @Date 2022/1/19 10:54
 */
public class MyCalculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }
    public static void main(String args[]) {
        int a = 20, b = 10;
        Calculation demo = new MyCalculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        //demo.multiplication(a,b);
    }
}
