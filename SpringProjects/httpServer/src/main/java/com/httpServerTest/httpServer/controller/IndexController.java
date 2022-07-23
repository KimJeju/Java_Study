package com.httpServerTest.httpServer.controller;


import com.httpServerTest.httpServer.Entity.Member;
import com.httpServerTest.httpServer.config.SecurityConfig;
import com.httpServerTest.httpServer.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    MemberRepository memberRepository;

    @Autowired //암호화를 위한 선언처리
    SecurityConfig config;
    @GetMapping("/")
    public  @ResponseBody String index(){
        return "index";
    }

    @GetMapping("/user")
    public @ResponseBody String user(){
        return "user";
    }

    @GetMapping("/admin")
    public  @ResponseBody String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    public @ResponseBody String manager(){
        return "manager";
    }

    @GetMapping("/login")
    public String login(){
        return "loginForm";
    }

    @GetMapping("/join")
    public String join(){
        return "joinForm";
    }


    @PostMapping("/join") //회원가입 메서드
    @ResponseBody
    public String join(Member member){
        member.setRole("ROLE_USER");
        String rawPassword = member.getPassword(); //기존 패스워드 가져오기
        String encPassword = config.bCryptPasswordEncoder().encode(rawPassword); //패스워드 암호화 인코딩
        member.setPassword(encPassword); //암호화 인코딩 set 해주기


        memberRepository.save(member);
        return "redirect:/login";
    }
}
