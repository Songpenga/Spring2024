package hello.core;

import hello.core.MemberInfo.Grade;
import hello.core.MemberInfo.MemberService;
import hello.core.MemberInfo.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        long memberId = 25L;
        Member member = new Member(memberId, Grade.VIP, "test계정");
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "testItem", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

        System.out.println("test complete");

    }
}
