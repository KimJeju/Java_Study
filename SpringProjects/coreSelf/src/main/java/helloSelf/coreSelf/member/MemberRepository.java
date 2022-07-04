package helloSelf.coreSelf.member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
