package com.ttbank.flep.core.config;

import com.ttbank.flep.core.interceptor.AccessLogInterceptor;
import com.ttbank.flep.core.interceptor.AuthorityInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author lucky
 * @Date 2022/1/24 10:13
 */
@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        addV1Rule(registry);
    }

    private void addV1Rule(InterceptorRegistry registry) {
        //注册自己的拦截器并设置拦截的请求路径
        registry.addInterceptor(new AccessLogInterceptor()).addPathPatterns("/**");  //拦截所有请求
        registry.addInterceptor(new AuthorityInterceptor()).addPathPatterns("/student/getStudentName");  //拦截student相关请求

    }
}
