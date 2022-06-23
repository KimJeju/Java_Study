package com.codestates.section3week1.member;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;


@RestController //REST API를 처리하기 위한 엔드포인트(Start point)로 선언하는 에노테이션
@RequestMapping(value = "/v1/members", produces = MediaType.APPLICATION_JSON_VALUE) //클라이언트의 요청과 클라이언트의 요청을 처리하는 핸들러 메서드를 매핑
public class MemberController {

    @PostMapping
    public String postMember(@RequestParam("email") String email,
                             @RequestParam("name") String name,
                             @RequestParam("phone") String phone){
        System.out.println("# Email : " + email);
        System.out.println("# name :" + name);
        System.out.println("# phone :" + phone);

        String response =  "{\"" +
                "email\":\"" +email+"\"," +
                "name\":\"" +name+"\"," +
                "phone\":\""+phone+"\","+
                "\"}";

        return response;
    }

    @GetMapping("/{member-id}")
    public String getMember(@PathVariable("member-id")Long memberId){
        System.out.println("# memberId : " + memberId);

        return null;
    }

    @GetMapping
    public String getMembers(){
        System.out.println("# getMembers");

        return null;
    }
}
