package hello.core.discount;

import hello.core.Member;
import hello.core.MemberInfo.Grade;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent/100 ;
        }else {
            return 0;
        }
    }
    //ctrl + shift + t => create new test
}
