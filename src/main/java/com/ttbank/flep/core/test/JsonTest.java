package com.ttbank.flep.core.test;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author lucky
 * @Date 2022/2/24 11:46
 */
public class JsonTest {
    public static void main(String[] args) {
        JsonChild jsonChild=new JsonChild();
        jsonChild.setName("aaa");
        jsonChild.setAddress("bbb");
        JsonChild jsonChild1 = JSONObject.parseObject(JSONObject.toJSONString(jsonChild), JsonChild.class);
        System.out.println(jsonChild1.getAddress());
    }
}
