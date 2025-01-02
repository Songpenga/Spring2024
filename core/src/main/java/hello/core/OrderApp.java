package hello.core;

import hello.core.MemberInfo.Grade;
import hello.core.MemberInfo.MemberService;
import hello.core.MemberInfo.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        Appconfig appconfig = new Appconfig();
        MemberService memberService = appconfig.memberService();
        OrderService orderService = appconfig.orderService();

/*        MemberService memberService = new MemberServiceImpl(null);
        OrderService orderService = new OrderServiceImpl(null, null);*/

        long memberId = 11L;
        Member member = new Member(memberId, Grade.VIP, "TestMember");
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "testItem", 20000);

        System.out.println("order => " + order);
        System.out.println("order => " + order.getItemName());
        System.out.println("order => " + order.calculatePrice());
    }
}
