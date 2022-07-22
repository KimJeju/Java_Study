package com.httpServerTest.httpServer.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity //스프링 시큐리티 필터가 스프링 필터 체인에 등록된다.
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable(); //form 에서만 요청이 가능하게 하고 postman 에서는 요청이 불가능 하게 만든다.
        http.headers().frameOptions().disable(); //h2 in-memory DB 접근을 위한 메서드

        http.authorizeRequests()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/manager/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_MANAGER')")
                .antMatchers("/admin/**").access("hasRole('Role_admin')")
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/login");
        return http.build();
    }

}
