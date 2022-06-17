package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    //저장된 회원 등록
   Member save(Member member);

   //회원정보를 검색할 find
   Optional<Member> findId(Long id);
   Optional<Member> findName(String name);
   List<Member> findAll();
}
