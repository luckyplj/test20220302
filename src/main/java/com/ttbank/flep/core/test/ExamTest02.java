package com.ttbank.flep.core.test;

import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @Author lucky
 * @Date 2022/2/23 9:46
 */
public class ExamTest02 {
    public static String reverse(String str){
        String[] splits = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=splits.length-1; i>=0; i--){
            String s = splits[i];
            char[] chars = s.toCharArray();
            for(char c : chars){
                if(c>=97){
                    String temp = c+"";
                    sb.append(temp.toUpperCase());
                }else{
                    String temp = c+"";
                    sb.append(temp.toLowerCase());
                }
            }
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String res = reverse("iOS");
        System.out.println(res);
    }


}
