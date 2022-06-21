package com.codestates.spring.AspectOrientedProgramming.spring.aop.test.aop;

import com.codestates.spring.AspectOrientedProgramming.spring.aop.test.Order.OrderRepository;
import com.codestates.spring.AspectOrientedProgramming.spring.aop.test.Order.OrderService;
import com.codestates.spring.AspectOrientedProgramming.spring.aop.test.Order.aop.Aspect1;
import com.codestates.spring.AspectOrientedProgramming.spring.aop.test.Order.aop.Aspect2;
import com.codestates.spring.AspectOrientedProgramming.spring.aop.test.Order.aop.Aspect3;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@Slf4j
@SpringBootTest
@Import(Aspect1.class)
public class AopTest {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderRepository orderRepository;

    @Test
    void aopInfo() {
        log.info("isAopProxy, orderService={}", AopUtils.isAopProxy(orderService));
        log.info("isAopProxy, orderRepository={}", AopUtils.isAopProxy(orderRepository));
    }

    @Test
    void success() {
        orderService.orderItem("itemA");
    }

    @Test
    void exception() {
        assertThatThrownBy(() -> orderService.orderItem("ex"))
                .isInstanceOf(IllegalStateException.class);
    }
}