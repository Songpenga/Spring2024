package hello.core.order;

import hello.core.Member;
import hello.core.MemberInfo.MemberRepository;
import hello.core.MemberInfo.MemoryMemberRepository;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findbyId(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
