package hello.core;

/*
* @Bean memberService -> new MemoryMemberRepository
* @Beam orderService  -> new MemoryMemberRepository
*
*/
import hello.core.MemberInfo.MemberService;
import hello.core.MemberInfo.MemberServiceImpl;
import hello.core.MemberInfo.MemoryMemberRepository;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(MemberRepository()); // 생성자 주입
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
                MemberRepository(),
                discountPolicy());
    }

    @Bean
    public MemoryMemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }



    //할인정책
    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
//        return new RateDiscountPolicy();
    }

}
