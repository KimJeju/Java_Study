package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;

    //테스트 실행전에 무조건 실행 되는 에너테이션
    @BeforeEach
    public void beforeEach(){
        //멤버서비스를 만들고
        AppConfig appConfig = new AppConfig();

        //멤버서비스에 AppConfig에 있는 memberService를 주입시킨다.
        memberService = appConfig.memberService();
    }


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
