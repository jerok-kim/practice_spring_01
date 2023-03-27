package kim.jerok.practice_spring_01.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
