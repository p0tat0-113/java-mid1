package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.BASIC,price);
        int gold = discountService.discount(StringGrade.GOLD,price);
        int diamond = discountService.discount(StringGrade.DIAMOND,price);

        //상수명을 잘못 넣으면 바로 컴파일 에러가 발생함. 따라서 오류를 쉽고 빠르게 찾을 수 있다.
        //int vip = discountService.discount(StringGrade.VIP,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);

        //하지만 문자열 상수를 사용해도 지금까지 발생한 문제들을 근복적으로 해결할 수는 없다.
        //개발자가 StringGrade에 있는 상수를 사용하지 않고 직접 문자열을 사용해도 막을 수가 없다.
    }
}
