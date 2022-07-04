package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.order.Order;
import hello.core.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {


        //appConfig선언
        AppConfig appConfig = new AppConfig();


        //appConfig를 통한 생성자 주입
        //각각
        // MemberServiceImpl(new MemoryMemberRepository)
        // OrderServiceImpl(new MemoryMemberRepository(),new FixDiscountPolicy()) 를 가지게 된다.
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        //멤버저장
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);


        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order : " + order);
    }
}
