package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {



    private final MemberRepository memberRepository;


    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입
    public Long join(Member member){
        //같은 이름이 있는 중복 회원이 있으면 안된다

        //Optional = npe(nullpointException)을 방지하기 위한 메서드
        //멤버 레포에서 이름을 찾아본다.
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {

        //이름 중복 확인 메서드
        memberRepository.findName(member.getName())
                .ifPresent(m ->{
            throw new IllegalStateException("이미 존재하는 이름입니다.");
        });
    }

    //전체회원조회
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findId(memberId);
    }
}
