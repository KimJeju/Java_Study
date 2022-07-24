package com.httpServerTest.httpServer.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity //스프링 시큐리티 필터가 스프링 필터 체인에 등록된다.               prePostEnabled=true : PreAuthorize 와 PostAuthorize 활성화e
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true) //securedEnabled = true : Config가 아닌 Controller에서 접근 권한 설정 가능
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable(); //form 에서만 요청이 가능하게 하고 postman 에서는 요청이 불가능 하게 만든다.
        http.headers().frameOptions().disable(); //h2 in-memory DB 접근을 위한 메서드

        http.authorizeRequests()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/manager/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_MANAGER')")
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .anyRequest().permitAll()
                .and()  //아래는 권한이 없을 시 로그인 form으로 이동하는 람다입니다.
                .formLogin()
                .loginPage("/login");
        return http.build();
    }

    @Bean //암호화를 위한 메서드
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
