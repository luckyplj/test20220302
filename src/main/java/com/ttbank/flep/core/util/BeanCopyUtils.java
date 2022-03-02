package com.ttbank.flep.core.util;

import com.sun.media.jfxmedia.logging.Logger;
import com.ttbank.flep.core.entity.Customer;
import com.ttbank.flep.core.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lucky
 * @Date 2022/1/4 10:14
 */
@Slf4j
public class BeanCopyUtils {
    public static <T> void beanCopyProperties(T src, T dest){
        Map<String,Object> properties=new HashMap<>();
        Arrays.stream(src.getClass().getDeclaredFields()).forEach((field -> {
            try {
                field.setAccessible(true);
                properties.put(field.getName(), field.get(src));
            } catch (IllegalAccessException e) {
                //log.error("",e );
            }
        }));
        populateBean(dest,dest.getClass(),properties);
        populateBean(dest,dest.getClass().getSuperclass(),properties);
    }

    private static <T> void populateBean(T bean,Class clazz,Map<String,Object> properties){
        Arrays.stream(clazz.getDeclaredFields()).forEach((field -> {
            try {
                field.setAccessible(true);
                //如果非空，覆盖原有值；如果为空，则不覆盖原有值
                if(properties.get(field.getName())!=null){
                    field.set(bean,properties.get(field.getName()));
                }

            } catch (IllegalAccessException e) {
                //log.error("",e);
            }
        }));
    }

    public static void main(String[] args) {
        Map<String,String> params=new HashMap<>();
        params.put("userInfo","ttbank 2021");
        Customer customer = Customer.builder().age(26).gender("man").params(params).build();
        //01 使用自己创建的工具类
        User user=new User();
        user.setName("lucky");
        beanCopyProperties(customer, user);
        System.out.println(user);
        params.put("userInfo","ttbank 2022");
        System.out.println(user);
        System.out.println(customer);

        //02 使用工具类BeanUtils
        User user2=new User();
        BeanUtils.copyProperties(customer,user2);
        System.out.println(user2);
    }
}
