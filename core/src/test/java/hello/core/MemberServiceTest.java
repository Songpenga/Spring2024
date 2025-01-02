package hello.core;

import hello.core.MemberInfo.Grade;
import hello.core.MemberInfo.MemberService;
import hello.core.MemberInfo.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {


    MemberService memberService;

    @BeforeEach
    public void beforEach(){
        Appconfig appconfig = new Appconfig();
        memberService = appconfig.memberService();
    }

    @Test
    void join(){
        //given
        Member member = new Member(11L, Grade.VIP, "test");

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(11L);

        //then
        //Assertions => 검증
        Assertions.assertThat(member).isEqualTo(findMember);

        System.out.println("test complete");
    }
}
