package enumeration.ref3;


public class ClassGradeRefMain2 {
    public static void main(String[] args) {
        int price = 10000;
        //가격 계산 기능도 Grade가 가지고 있기 때문에 더이상 DiscountService를 사용할 필요가 없음.

        System.out.println(Grade.BASIC.discount(price));
        System.out.println(Grade.GOLD.discount(price));
        System.out.println(Grade.DIAMOND.discount(price));
    }
}
