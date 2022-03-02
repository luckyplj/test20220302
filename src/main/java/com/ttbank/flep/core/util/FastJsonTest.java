package com.ttbank.flep.core.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ttbank.flep.core.entity.User;

/**
 * @Author lucky
 * @Date 2022/1/18 14:19
 */
public class FastJsonTest {
    public static void main(String[] args) {
        obj2String();
    }

    public static void obj2String(){
        User user=new User();
        user.setName("lucky");
        user.setAge(25);
        String s = JSONObject.toJSONString(user);
        System.out.println(s);
    }

    public void obj2String2(){
        User user=new User();
        user.setName("linda");
        user.setAge(27);
        String s1 = JSONObject.toJSONString(user);
        System.out.println(s1);
    }
}
