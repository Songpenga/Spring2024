package hello.helloSpring.controller;


import hello.helloSpring.domain.Member;
import hello.helloSpring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {

    //private final MemberService memberService = new MemberService();
    //service를 새로 선언하는것보다 컨테이너에 새로 등록하는것이 낫다.
    private final MemberService memberService;

    /**
    * 스프링은 스프링 컨테이너에 스프링빈을 등록할떄, 기본으로 싱글톤으로 등록한다.
     * -> 유일하게 하나만 등록해서 공유한다.
     * 따라서 같은 스프링빈이면 모두 같은 인스턴스다.
     * 설정으로 싱글톤이 아니게 설정할 수 있지만, 특별한 경우를 제외하면 대부분 싱글톤을 사용한다.
     *
     * [스프링 빈 등록]  controller -> service -> repository
    * */

    // 생성자에 @Autowired를 달아주면 해당 CONTROLLER에 서비스가 연결된다.
    //단, 연결 SERVICE에 @SERVICE 가 없다면 해당 서비스를 찾을수 없다는 오류가 뜬다.
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService; // 생성자
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }
    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        System.out.println("member = " + member.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/membersList";
    }
}
