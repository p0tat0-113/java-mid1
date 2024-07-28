package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;

        System.out.println(discountService.discount(ClassGrade.BASIC,price));
        System.out.println(discountService.discount(ClassGrade.GOLD,price));
        System.out.println(discountService.discount(ClassGrade.DIAMOND,price));

        //이제 사용자가 값을 마음대로 넣으려고 하면 바로 컴파일 에러가 발생함.
        //System.out.println(discountService.discount("VIP",price));
    }
}
