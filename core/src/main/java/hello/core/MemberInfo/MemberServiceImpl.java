package hello.core.MemberInfo;

import hello.core.Member;

public class MemberServiceImpl implements MemberService {

    //private final MemberRepository memberRepository = new MemoryMemberRepository(); // <= config 추가 전
    private final MemberRepository memberRepository; // <= config 추가 후

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository; //memberRepository의 구현체에 무엇이 들어올지를 생성자를 통해 결정
    }


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findbyId(memberId);
    }
}
