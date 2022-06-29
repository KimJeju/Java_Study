package hello.core;

import hello.core.member.*;

public class MemberApp {

    public static void main(String[] args) {


        //Appconfig 무조건 생성
        AppConfig appConfig = new AppConfig();
        //AppConfig에서 멤버서비스 꺼내기 및 주입
        MemberService memberService = appConfig.memberService();
        // MemberService memberService = new MemberServiceImpl(); 기존에는  멤버서비스 객체를직접 생성해주었다.


        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember :" + findMember.getName());

    }
}
