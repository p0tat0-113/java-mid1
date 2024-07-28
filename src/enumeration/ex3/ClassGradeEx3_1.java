package enumeration.ex3;

import static enumeration.ex3.Grade.*; //static import

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int price = 10000;

        System.out.println(discountService.discount(BASIC,price));
        System.out.println(discountService.discount(GOLD,price));
        System.out.println(discountService.discount(DIAMOND,price));

        //Grade grade = new Grade(); //열거형은 외부 생성이 불가능하다.
        //System.out.println(discountService.discount(grade,price));
    }
}
