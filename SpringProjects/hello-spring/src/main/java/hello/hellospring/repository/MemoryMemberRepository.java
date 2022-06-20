package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

//MemberRepository 멤버 및 메서드들을 구현할 구현체

public class MemoryMemberRepository implements MemberRepository{

   HashMap<Long,Member> store = new HashMap<>();
   Long sequence = 0L;

   @Override
   public Member save(Member member){
       //아이디를 저장하기 위한 구현메서드
       member.setId(sequence++);
       store.put(member.getId(), member);
       return member;
   }

   @Override
   public Optional<Member> findId(Long id){
       //Optional 반환 ofNullable을 걸어준 이유는 아이디가 null일 수 있기 때문
       return Optional.ofNullable(store.get(id));
   }

   @Override
   public Optional<Member> findName(String name){
       //멤버에서 받아온 값을 필터 후 비교
       return store.values().stream().filter(member -> member.getName().equals(name))
               .findAny();
       //아니라면 findAny를 통해서 출력
   }

   @Override
   public List<Member> findAll(){
       //이 메서드는 List형을 반환하기 때문에 HaspMap 에서 전달받은 파라미터를
       //배열에 넣어주고 반환
       //new 키워드를 사용해 배열 선언.
       return new ArrayList<>(store.values());
   }

   public void clearStore(){
       store.clear();
   }


}
