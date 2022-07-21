package hello.core.singletone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingle(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);


        //TreadA : A사용자 10000원 주문
        int userAPrice = statefulService1.order("userA", 10000);

        //TreadB : B사용자 5000원 주문
        int userBPrice = statefulService2.order("userB", 5000);

        //TreadA : 사용자A 주문 금액 조회
        //기대값은 10000원 이지만 출력은 5000원이 된다.
        System.out.println("price = " + userAPrice);

        //then
        //
        assertThat(userAPrice).isEqualTo(10000);

    }

    static class TestConfig{


        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }

}