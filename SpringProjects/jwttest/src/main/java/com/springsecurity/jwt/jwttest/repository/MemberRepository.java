package com.springsecurity.jwt.jwttest.repository;

import com.springsecurity.jwt.jwttest.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    //username을 기준으로 검색
    public Member findByUsername(String username);
}
