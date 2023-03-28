package kim.jerok.practice_spring_01;

import kim.jerok.practice_spring_01.discount.DiscountPolicy;
import kim.jerok.practice_spring_01.discount.RateDiscountPolicy;
import kim.jerok.practice_spring_01.member.MemberRepository;
import kim.jerok.practice_spring_01.member.MemberService;
import kim.jerok.practice_spring_01.member.MemberServiceImpl;
import kim.jerok.practice_spring_01.member.MemoryMemberRepository;
import kim.jerok.practice_spring_01.order.OrderService;
import kim.jerok.practice_spring_01.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
