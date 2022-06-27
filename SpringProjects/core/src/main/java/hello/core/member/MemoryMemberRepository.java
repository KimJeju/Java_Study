package hello.core.member;

import java.util.HashMap;
import java.util.Map;

//레포지토리 구현체
public class MemoryMemberRepository implements MemberRepository{


    //haspMap을 실무에서 쓰면 동시성오류가 날 수 도 있다.
    private static Map<Long,Member> store = new HashMap<>();

    @Override
    public void sava(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
