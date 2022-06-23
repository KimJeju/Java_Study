package com.codestates.section3week1.member;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


@RestController //REST API를 처리하기 위한 엔드포인트(Start point)로 선언하는 에노테이션
@RequestMapping(value = "/v1/members") //클라이언트의 요청과 클라이언트의 요청을 처리하는 핸들러 메서드를 매핑
public class MemberController {

    @PostMapping
    public ResponseEntity postMember(@RequestParam("email") String email,
                             @RequestParam("name") String name,
                             @RequestParam("phone") String phone){
        Map<String, String> response = new HashMap<>();
        response.put("email",email);
        response.put("name",name);
        response.put("phone",phone);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id")Long memberId){
        System.out.println("# memberId : " + memberId);

        return new ResponseEntity<>(memberId, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers(){
        System.out.println("# getMembers");

        return new ResponseEntity(HttpStatus.OK);
    }
}
