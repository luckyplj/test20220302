package com.ttbank.flep.core.test;

import com.ttbank.flep.core.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Author lucky
 * @Date 2022/1/7 11:19
 */
public class StreamTest {
    public static void test(String[] args) {
        List<User> userList=new ArrayList<>();
        User user1=new User();
        user1.setName("lucky");
        User user2=new User();
        user2.setName("linda");
        userList.add(user1);
        userList.add(user2);
        List<String> nameList = userList.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(nameList);



        String[] address={"tiantai","shaoxing","hangzhou"};
        List<Integer> lengthList = Arrays.stream(address).map(String::length).collect(Collectors.toList());
        System.out.println(lengthList);



    }

    public static void test1(String[] args) {
        String[] address={"tiantai","shaoxing","hangzhou"};
        List<Integer> lengthList = Arrays.stream(address).map(String::length).collect(Collectors.toList());
        System.out.println(lengthList);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random random=new Random();
        try {
            Thread.sleep(random.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");
    }
}
