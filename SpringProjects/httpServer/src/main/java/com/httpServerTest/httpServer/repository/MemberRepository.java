package com.httpServerTest.httpServer.repository;

import com.httpServerTest.httpServer.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
