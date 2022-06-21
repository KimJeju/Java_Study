package hello.hellospring;

import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;


//스프링 빈에 등록
@Configuration
public class SpringConfig {

   private EntityManager em;

   @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
       // return new MemoryMemberRepository();
       // return new JdbcMemberRepository(dataSource);
       // return new jdbcTemplateRepository(dataSource);
        return new JpaMemberRepository(em);
    }
}
