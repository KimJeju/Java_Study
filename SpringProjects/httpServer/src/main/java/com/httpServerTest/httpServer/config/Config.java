package com.httpServerTest.httpServer.config;

import com.httpServerTest.httpServer.filter.FirstFilter;
import com.httpServerTest.httpServer.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Filter;

//FistFilter를 적용시키기 위한 Config 클래스 입니다.

@Configuration
public class Config {

    @Bean
    public FilterRegistrationBean<FirstFilter> firstFilterRegister() {
        FilterRegistrationBean<FirstFilter> filterRegister = new FilterRegistrationBean<>(new FirstFilter());
        filterRegister.setOrder(1); //setOrder 는 필터 적용 순서를 정할 수 있다 .
        return filterRegister;
    }

    @Bean
    public FilterRegistrationBean<SecondFilter> SecondFilterRegister(){
        FilterRegistrationBean<SecondFilter> secondFilter = new FilterRegistrationBean<>(new SecondFilter());
        secondFilter.setOrder(2);
        return secondFilter;
    }
}
