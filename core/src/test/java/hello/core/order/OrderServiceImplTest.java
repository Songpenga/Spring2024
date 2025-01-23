package hello.core.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {
    @Test
    void createOrder(){
        OrderServiceImpl orderService = new OrderServiceImpl();
        orderService.createOrder(1L, "testAAA", 100000);
        /* 1.
        java: constructor OrderServiceImpl in class hello.core.order.OrderServiceImpl cannot be applied to given types;
        required: no arguments
        found:    hello.core.MemberInfo.MemberRepository,hello.core.discount.DiscountPolicy
        reason: actual and formal argument lists differ in length
        * */

        /* 2.
        java.lang.NullPointerException: Cannot invoke "hello.core.MemberInfo.MemberRepository.findbyId(long)" because "this.memberRepository" is null
        * */
    }

}