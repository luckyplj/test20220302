package com.ttbank.flep.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author lucky
 * @Date 2021/12/31 15:02
 */
@Data
@Builder
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private String gender;
    private Map<String,String> params;
}
