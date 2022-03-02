package com.ttbank.flep.core.test;

import java.util.*;

/**
 * @Author lucky
 * @Date 2022/1/10 9:19
 */
public class ExamTest {
    public static void main(String[] args) {
        //Integer[] nums1={4,9,5};
        Integer[] nums1={1,2,2,1};
        //Integer[] nums2={9,4,9,8,4};
        Integer[] nums2={2,2};
        Set<Integer> exchange = exchange(nums1, nums2);
        System.out.println(exchange);



    }

    public static Set<Integer> exchange(Integer[] s1,Integer[] s2){
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        if(s1.length>s2.length){
            a1=Arrays.asList(s2);
            a2=Arrays.asList(s1);
        }else{
            a1=Arrays.asList(s1);
            a2=Arrays.asList(s2);
        }
        Set<Integer> set=new HashSet<>();
        for(Integer i:a1){
            if(a2.contains(i)){
                set.add(i);
            }
        }
        return set;
    }


}
