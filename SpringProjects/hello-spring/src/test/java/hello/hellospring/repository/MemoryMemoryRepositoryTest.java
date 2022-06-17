package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemoryRepositoryTest {

    //테스트는 서로 의존관계에 없이 동작해야한다.
    MemoryMemberRepository Repository = new MemoryMemberRepository();

    //이 에너테이션은 한 메서드가 끝날 때 마다 메서드를 동작하게 하는 에너테이션이다.
    //테스트는 메서드에 타 메서드와 같은 값이 들어갈 수 있기 때문에 AfterEach 이너테이션을 통해 클리어를 지속적으로 해주어야한다.
    @AfterEach
    public void afterEach(){
        //테스트가 끝날 때 마다 데이터를 비움.

        Repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("Spring");

        Repository.save(member);

        //반환타입이 Optional 에서는 맨뒤 get() 메서드를 붙여줘서 값을 꺼낼 수 있다.
        Member result = Repository.findId(member.getId()).get();

        //Assertions.assertEquals를 통해서 result (받은 파라미터)와 member의 데이터가 동일 한 지 확인 할 수 있다.
        //alt + enter를 통해 Assertions 생략가능
        assertThat(member).isEqualTo(result);


        //Assertions.assertEquals(result,member); 이 Assertions는 org.junit.jupiter.api.

    }

    @Test
    public void findName(){
        Member member1 = new Member();
        member1.setName("Spring1");
        Repository.save(member1);

        Member member2 = new Member();
        member2.setName("Spring2");
        Repository.save(member2);


        //회원가입한 사람 찾기
        Member result =Repository.findName("Spring1").get();
        assertThat(member1).isEqualTo(result);
    }

    //전체찾기
    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("Spring1");
        Repository.save(member1);

        Member member2 = new Member();
        member2.setName("Spring2");
        Repository.save(member2);

        //리스트니까 size를 통해 배열의 길이를 측정해 비교한다
        List<Member> result = Repository.findAll();
        assertThat(result.size()).isEqualTo(2);
        //객체가 둘이기 때문에 2와 비교하면 정상작동할 것이다.
    }

}
