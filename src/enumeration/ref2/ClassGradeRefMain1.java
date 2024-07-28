package enumeration.ref2;

public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;

        System.out.println(discountService.discount(Grade.BASIC,price));
        System.out.println(discountService.discount(Grade.GOLD,price));
        System.out.println(discountService.discount(Grade.DIAMOND,price));
    }
}
