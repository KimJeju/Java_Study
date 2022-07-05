package hello.core;

import hello.core.member.*;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

public class MemberApp {

    public static void main(String[] args) {


//        //Appconfig 무조건 생성
//        AppConfig appConfig = new AppConfig();
//        //AppConfig에서 멤버서비스 꺼내기 및 주입
//        MemberService memberService = appConfig.memberService();
//        // MemberService memberService = new MemberServiceImpl(); 기존에는  멤버서비스 객체를직접 생성해주었다.

        //AppConfig에 있는 환경 설정에 따라 스프링 컨테이너에서 빈 관리
        ApplicationContext applicationContext = new AnnotationConfigReactiveWebApplicationContext(AppConfig.class);

        //멤버 서비스를 꺼낼 시에 (멤버서비스 이름을 입력, 타입)
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);


        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember :" + findMember.getName());

    }
}
