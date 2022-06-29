package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

//앱전체를 설정하고 구성하는 클래스
public class AppConfig {


    //멤버서비스 생성
    public MemberService memberService(){
        //리파지토리 선택
        //생성자 주입
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        //할인정책과 멤버정보를 가져올 레파지토리 생성자주입
        return new OrderServiceImpl(new MemoryMemberRepository(),new FixDiscountPolicy());
    }
}
