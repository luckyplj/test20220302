package com.ttbank.flep.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lucky
 * @Date 2022/1/5 16:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String age;

    public static int compareByAge(Person a,Person b){
        return a.age.compareTo(b.age);
    }
}
