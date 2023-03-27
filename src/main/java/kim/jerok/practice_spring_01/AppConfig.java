package kim.jerok.practice_spring_01;

import kim.jerok.practice_spring_01.discount.DiscountPolicy;
import kim.jerok.practice_spring_01.discount.FixDiscountPolicy;
import kim.jerok.practice_spring_01.member.MemberRepository;
import kim.jerok.practice_spring_01.member.MemberService;
import kim.jerok.practice_spring_01.member.MemberServiceImpl;
import kim.jerok.practice_spring_01.member.MemoryMemberRepository;
import kim.jerok.practice_spring_01.order.OrderService;
import kim.jerok.practice_spring_01.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

}
