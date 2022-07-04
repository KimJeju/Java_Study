package helloSelf.coreSelf.member;


//서비스 인터페이스
public interface MemberService {

    void join(Member member);
    Member findById(long memberId);
}
