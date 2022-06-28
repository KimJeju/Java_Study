package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService =new MemberServiceImpl();


    //조인한 멤버가 find멤버와 같은 지를 판별하는 테스트 입니다.
    @Test
    void join(){
        //give
        Member member = new Member(1L,"memberA",Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
