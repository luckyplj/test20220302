package com.ttbank.flep.core.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ttbank.flep.core.entity.User;

import java.util.*;

/**
 * @Author lucky
 * @Date 2021/12/31 14:40
 */
public class FastJsonTest {
    public static void main(String[] args) {
        String jsonStr1 = "{\"school\":\"计量\",\"sex\":\"男\",\"name\":\"lucky\",\"age\":22}";
        JSONObject jsonObject2 = JSONObject.parseObject(jsonStr1);
        System.out.println(jsonObject2.getString("name"));
        System.out.println(jsonObject2.getInteger("age"));

    }
}
