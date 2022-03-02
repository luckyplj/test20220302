package com.ttbank.flep.core.test1;

/**
 * @Author lucky
 * @Date 2022/1/26 10:47
 */
class Father{
    public int t;
    public final int b; //编译成功
    public final int c = 1; //编译成功

    public Father() {  //构造方法
        b=2;  //在构造方法中将成员变量b进行初始化
    }
}

