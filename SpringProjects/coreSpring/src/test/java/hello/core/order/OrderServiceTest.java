package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;


    //테스트 전에 무조건실행되는 BeforeEach메서드
    @BeforeEach
    public void beforeEach(){
        //AppConfig를 생성하고
        AppConfig appConfig = new AppConfig();

        //각각에 맞는 생성자를 주입시킨다.
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){

        //give
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);


        //when
        //오더에 주문 넣어주기
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        //then
        //할인 금액이 천원일 경우 테스트 통과
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
