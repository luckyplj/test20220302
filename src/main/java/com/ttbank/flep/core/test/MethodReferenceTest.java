package com.ttbank.flep.core.test;

import com.ttbank.flep.core.entity.MyString;
import com.ttbank.flep.core.entity.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author lucky
 * @Date 2022/1/7 18:23
 */
public class MethodReferenceTest {
    public static void main(String[] args) {
        String[] stringsArray = {"Hello","World"};

        //使用lambda表达式和类型对象的实例方法
        Arrays.sort(stringsArray,(s1,s2)->s1.compareToIgnoreCase(s2));

        //使用方法引用
        //引用的是类型对象的实例方法
        Arrays.sort(stringsArray, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(stringsArray));
    }
}
