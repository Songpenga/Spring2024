package hello.helloSpring.controller;


import hello.helloSpring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    /**
    * 스프링은 스프링 컨테이너에 스프링빈을 등록할떄, 기본으로 싱글톤으로 등록한다.
     * -> 유일하게 하나만 등록해서 공유한다.
     * 따라서 같은 스프링빈이면 모두 같은 인스턴스다.
     * 설정으로 싱글톤이 아니게 설정할 수 있지만, 특별한 경우를 제외하면 대부분 싱글톤을 사용한다.
     *
     * [스프링 빈 등록]  controller -> service -> repository
    * */
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService; // 생성자
    }
}
