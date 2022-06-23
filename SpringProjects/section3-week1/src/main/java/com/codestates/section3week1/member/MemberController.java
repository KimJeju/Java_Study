package com.codestates.section3week1.member;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //REST API를 처리하기 위한 엔드포인트(Start point)로 선언하는 에노테이션
@RequestMapping("/v1/members") //클라이언트의 요청과 클라이언트의 요청을 처리하는 핸들러 메서드를 매핑
public class MemberController {
}
