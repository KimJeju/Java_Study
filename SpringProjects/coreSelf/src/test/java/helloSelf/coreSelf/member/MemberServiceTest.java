package helloSelf.coreSelf.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;



    @Test
    void join(){

        Member member = new Member(1L,"김또깡",Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findById(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
