package hello.core.singletone;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingleTonTest {

    @Test
    @DisplayName("스프링 없는 Di 컨테이너")
    void pureContainer(){
        AppConfig appConfig = new AppConfig();

        //1.조회 : 호출할 떄 마다 객체를 생성하는지
        MemberService memberService = appConfig.memberService();

        //2.조회 : 호출할 떄 마다 객체를 생성하는지
        MemberService memberService2 = appConfig.memberService();

        //참조값이 다른가?
        System.out.println("memberService = " + memberService);
        System.out.println("memberService2 = " + memberService2);


        //memberService != memberService2
        Assertions.assertThat(memberService).isNotEqualTo(memberService2);
    }
}
