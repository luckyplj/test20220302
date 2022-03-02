package com.ttbank.flep.core.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author lucky
 * @Date 2022/1/24 9:58
 */
@Slf4j
public class AccessLogInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("进入到拦截器AccessLogInterceptor中:preHandle() 方法");
        String remoteAddr=getRequestIp(request);
        log.info("接收到来自[{}]请求",remoteAddr);
        return true;
    }

    private String getRequestIp(HttpServletRequest request) {
        String requestIp = request.getHeader("x-forwarded-for");
        return requestIp;

    }
}
