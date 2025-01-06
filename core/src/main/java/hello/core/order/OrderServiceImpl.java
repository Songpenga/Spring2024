package hello.core.order;

import hello.core.Member;
import hello.core.MemberInfo.MemberRepository;
import hello.core.MemberInfo.MemoryMemberRepository;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;

public class OrderServiceImpl implements OrderService{

    /*
    추상(인터페이스)의존 : DiscountPolicy
    구현클래스 의존 : RateDiscountPolicy, FixDiscountPolicy
    => DIP를 위반하지 않도록 인터페이스에만 의존하도록 의존관계를 변경하면 된다.
       어떻게? -> 인터페이스에만 의존하도록 설계를 변경하면 된다.
    */

    /* ====== 관심사의 분리 ======
    * OrderServiceImpl에는 MemoryMemberRepository, FixDiscountPolicy 객체의 의존관계가 주입된다.
    */
    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    /* 인터페이스 의존으로 수정*/
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    /* DIP 위반 */
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); // <==  고정할인
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findbyId(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트용으로 추가
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
