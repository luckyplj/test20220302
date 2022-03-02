package com.ttbank.flep.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author lucky
 * @Date 2021/11/25 16:44
 */

@SpringBootApplication(scanBasePackages="com.ttbank")
@EnableDiscoveryClient
@EnableScheduling
@MapperScan("com.ttbank.flep.core.mapper")
public class FileFlepApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileFlepApplication.class,args);
    }

}
