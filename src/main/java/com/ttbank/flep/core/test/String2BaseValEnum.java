package com.ttbank.flep.core.test;

import java.util.Arrays;

/**
 * @Author lucky
 * @Date 2022/1/20 15:48
 */
public enum  String2BaseValEnum {
    BOOLEAN(Boolean.class){
        @Override
        public Boolean cast(String valStr) {
            return Boolean.valueOf(valStr);
        }
    },
    INTEGER(Integer.class){
        @Override
        public Integer cast(String valStr) {
            return Integer.valueOf(valStr);
        }
    },
    STRING(String.class){
        @Override
        public String cast(String valStr) {
            return valStr;
        }
    };

    Class clazz;

    String2BaseValEnum(Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public abstract <T> T cast(String valStr);

    public static String2BaseValEnum valueOfClazz(Class clazz){
        return Arrays.stream(String2BaseValEnum.values()).filter(string2BaseValEnum -> {
            return string2BaseValEnum.getClazz()==clazz;
        }).findFirst().orElseGet(()->{
            return String2BaseValEnum.STRING;
        });
    }
}
