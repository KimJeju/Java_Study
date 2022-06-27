package hello.core.member;

//회원 저장소 역할
public interface MemberRepository {

    //회원저장기능
    void sava(Member member);

    //회원 찾기 기능
    Member findById(Long memberId);
}
