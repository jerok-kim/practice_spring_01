package kim.jerok.practice_spring_01.discount;

import kim.jerok.practice_spring_01.member.Grade;
import kim.jerok.practice_spring_01.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }

}
