package com.ttbank.flep.core.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author lucky
 * @Date 2022/1/18 15:36
 * //@Value("${flep.cluster_name}")
 */
@Component
@ConfigurationProperties(prefix = "flep")
@Data
public class FileUaProperties {

    private String clusterName;

    private String subsysCode;

    private String contentId;

}
