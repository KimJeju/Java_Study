package com.springsecurity.jwt.jwttest.config;

import com.springsecurity.jwt.jwttest.filter.FirstFilter;
import com.springsecurity.jwt.jwttest.filter.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public SecurityConfig(CorsFilter corsFilter) {
        this.corsFilter = corsFilter;
    }

    private final CorsFilter corsFilter;
    @Bean                                                                                       //먼저실행 -> 나중에 실행
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception { //addFilterBefore(필터, 특정 필터 이름.class)
//        http.addFilterBefore(new FirstFilter(),BasicAuthenticationFilter.class);
        http.csrf().disable(); // PostMan 에서의 CRUD 막기
        http.headers().frameOptions().disable();       //아래는 무상태성 정책에서 시작하겠단 의미 : 기존 스프링 보안 사용 X
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .formLogin().disable() //form에서의 로그인 막기
                .httpBasic().disable()
                .apply(new CustomDls())
                .and()
                .authorizeRequests()
                .antMatchers("/api/v1/user/**")
                .access("hasRole('ROLE_USER') or hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
                .antMatchers("/api/v1/manager/**")
                .access("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
                .antMatchers("/api/v1/admin/**")
                .access("hasRole('ROLE_ADMIN')")
                .anyRequest().permitAll()
                .and()
                .addFilter(corsFilter);

        return http.build();
    }


    public class CustomDls extends AbstractHttpConfigurer<CustomDls,HttpSecurity>{

        @Override
        public void configure(HttpSecurity builder) throws Exception{
            AuthenticationManager manager = builder.getSharedObject(AuthenticationManager.class);
            builder.addFilter(corsFilter).addFilter(new JwtAuthenticationFilter(manager));
        }

    }
}
