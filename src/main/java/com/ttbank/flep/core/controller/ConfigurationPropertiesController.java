package com.ttbank.flep.core.controller;

import com.ttbank.flep.core.entity.FileUaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lucky
 * @Date 2022/1/18 15:43
 */
@Slf4j
@RestController
@RequestMapping("/test/properties")
public class ConfigurationPropertiesController{
    @Autowired
    FileUaProperties fileUaProperties;

    @PostMapping("/getProperties")
    public void getProperties(){
        log.info(fileUaProperties.getClusterName());
        log.info(fileUaProperties.getSubsysCode());
        log.info(fileUaProperties.getContentId());
    }
}
