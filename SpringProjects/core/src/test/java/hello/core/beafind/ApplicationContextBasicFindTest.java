package hello.core.beafind;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBasicFindTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
        MemberService memberService = ac.getBean("memberService", MemberService.class);

        //멤버서비스가 멤버서비스구현체에 의존하면 성공
       assertThat(memberService).isInstanceOf(MemberServiceImpl.class);

    }

    @Test
    @DisplayName("이름없이 타입으로만 조회")
    void findBeanByType(){
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);

    }


    //아래코드는 역할이 아닌 구현에 의존하기 떄문에 좋은 코드가 아니다.
    @Test
    @DisplayName("구체타입으로조회")
    void findBeanByt(){
        MemberServiceImpl memberService = ac.getBean(MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }


    //예외
    @Test
    @DisplayName("빈 이름으로 조회 불가")
    void findBeanByNameX(){
        //ac.getBean("xxxx", MemberService.class)
//        MemberService xxxx = ac.getBean("xxxx", MemberService.class);

        //junit assert
        //오른쪽에 있는 예외코드를 실행하면 왼쪽에 예외가 터져야한다
        assertThrows(NoSuchBeanDefinitionException.class, () -> ac.getBean("xxxx", MemberService.class));
    }
}
