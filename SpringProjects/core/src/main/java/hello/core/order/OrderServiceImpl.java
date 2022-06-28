package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    //주문하는 회원정보를 담고있는 리포지토리
    private MemberRepository memberRepository = new MemoryMemberRepository();

    //할인정책
    private DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        //회원정보조회
        Member member = memberRepository.findById(memberId);

        //할인 적용
        int discountPrice = discountPolicy.discount(member, itemPrice);

        //주문반환
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
