package com.codestates.spring.AspectOrientedProgramming.spring.aop.test.Order;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class OrderRepository {
    public String save(String itemId) {
        log.info("[orderRepository] 실행");

        //저장 로직
        if (itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생");
        }
        return "ok";
    }
}
