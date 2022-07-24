package com.httpServerTest.httpServer.config;

import com.httpServerTest.httpServer.filter.FirstFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//FistFilter를 적용시키기 위한 Config 클래스 입니다.

@Configuration
public class Config {

    @Bean
    public FilterRegistrationBean<FirstFilter> firstFilterRegister() {
        FilterRegistrationBean<FirstFilter> filterRegister = new FilterRegistrationBean<>(new FirstFilter());
        return filterRegister;
    }
}
