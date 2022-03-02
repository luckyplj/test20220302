package com.ttbank.flep.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author lucky
 * @Date 2021/12/7 18:15
 */
public class PropertyUtil {
    public static Properties properties;

    static {
        loadProperties();
    }

    synchronized private static void loadProperties() {
        properties=new Properties();
        InputStream inputStream=null;
        try {
            inputStream=PropertyUtil.class.getClassLoader().getResourceAsStream("flep.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String key){
        if(properties==null){
            loadProperties();
        }
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        String name = getProperties("name");
        System.out.println(name);
    }
}
