package hello.helloSpring.service;

import hello.helloSpring.domain.Member;
import hello.helloSpring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

//@Service
public class MemberService {

    //private final MemberRepository memberRepository = new MemoryMemberRepository();

    private final MemberRepository memberRepository;

    //@Autowired
    public MemberService(MemberRepository memberRepository) { //defendent exation
        this.memberRepository = memberRepository;
    }

    /**
    * 회원가입
    * */
    public Long join(Member member){

        //  같은 이름이 있는 중복회원 x
        validateDuplicateMember(member); //  중복회원 검증 ctrl + shift + m
        memberRepository.save(member);
        return  member.getId();

        //1.
        //Optional<Member> result = memberRepository.findByName(member.getName());
        /* result.ifPresent(m -> {
                throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        */


    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원 입니다.");
                });
    }

    //전체 회원 조회
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return  memberRepository.findById(memberId);
    }

}
