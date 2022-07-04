package helloSelf.coreSelf.member;

public class MemberServiceImpl implements MemberService{


    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(long memberId) {
        return memberRepository.findById(memberId);
    }
}
