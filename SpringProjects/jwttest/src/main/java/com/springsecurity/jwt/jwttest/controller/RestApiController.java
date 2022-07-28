package com.springsecurity.jwt.jwttest.controller;

import com.springsecurity.jwt.jwttest.entity.Member;
import com.springsecurity.jwt.jwttest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor //자동 생성자 주입
public class RestApiController {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/home")
    public String home(){
        return "<h1>home</h1>";
    }

    @PostMapping("/token")
    public String token() {
        return "<h1>token</h1>";
    }

    @GetMapping("/api/v1/user")
    public String user() {
        return "user";
    }
    // 추가
    @GetMapping("/api/v1/admin")
    public String admin() {
        return "admin";
    }
    @PostMapping("/join") //회원가입 처리를 위한 로직추가.
    public String join(@RequestBody Member member){
        member.setPassword(bCryptPasswordEncoder.encode(member.getPassword()));
        member.setRoles("ROLE_USER");
        memberRepository.save(member);
        return "회원 가입 완료";
    }
}
