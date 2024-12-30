package hello.core;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

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
