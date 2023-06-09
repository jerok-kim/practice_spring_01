package kim.jerok.practice_spring_01.discount;

import kim.jerok.practice_spring_01.member.Grade;
import kim.jerok.practice_spring_01.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }

}
