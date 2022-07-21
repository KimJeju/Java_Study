package hello.core.singletone;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체사용")
    void singletonServiceTest(){

        //given
        SingleTonService singletonService = SingleTonService.getInstance();
        SingleTonService singletonService2 = SingleTonService.getInstance();

        //when
        System.out.println("singleTonService = " + singletonService);
        System.out.println("singletonService2 = " + singletonService2);

        //then

        //Assertions.assertThat(singletonService).isEqualTo(singletonService2);
        Assertions.assertThat(singletonService).isSameAs(singletonService2);

        //isEqualTo : equals 메서드
        //isSameAs : == (인스턴트비교)


    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer(){
//        AppConfig appConfig = new AppConfig();

       ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService1 = ac.getBean("memberService",MemberService.class);

        MemberService memberService2 = ac.getBean("memberService",MemberService.class);

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        //각은 객체가 반환된다 (싱글톤이 적용된다)
        Assertions.assertThat(memberService1).isSameAs(memberService2);
    }
}
