package com.ttbank.flep.core.test;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @Author lucky
 * @Date 2021/12/14 18:48
 */
public class StringUtilsTest {

    public static void main(String[] args){
//        Properties properties = System.getProperties();
//        String o = (String) properties.get("os.name");
//        System.out.println(o);

        int []arr = {10,20,30,40,50};
        int []arr1 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr1)); //[10, 20, 30]
        System.out.println(Arrays.toString(arr));  //[10, 20, 30, 40, 50]
    }





}
