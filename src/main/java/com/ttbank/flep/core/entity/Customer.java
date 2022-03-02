package com.ttbank.flep.core.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author lucky
 * @Date 2022/1/4 10:28
 */
@Slf4j
@Builder
@Data
public class Customer {
    private String name;
    private int age;
    private String gender;
    private Map<String,String> params;
    private Map<String,String> heads;
}
