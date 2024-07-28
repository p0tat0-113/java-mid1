package enumeration.ex0;
//앞에서 만든 단순히 문자열을 입력하는 방식은, 오타가 발생하기 쉽고, 유효하지 않는 값이 입력될 수 있다.
//다음 예를 보자.
public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        //소문자 - 데이터 일관성 부족 GOLD, gold, GoLd
        int gold = discountService.discount("gold",price);

        //오타 - 타입 안정성 부족
        int diamond = discountService.discount("DIAMONDDD",price);

        //존재 하지 않는 등급 - 타입 안정성 부족
        int vip = discountService.discount("VIP",price);

        System.out.println(gold);
        System.out.println(diamond);
        System.out.println(vip);

        //등급에 문자열을 사용하는 지금의 방식은 타입 안정성이 부족하고, 데이터 일관성이 떨어진다.
        //이런 문제를 해결하려면 특정 범위로 값을 제한해야 한다.
        //정확한 문자만 메서드에 전달해야 하는데 String은 어떤 문자열이든 받을 수 있기 때문에 자바 문법 관점에서는 아무런 문제가 없다.
        //결국 String을 이용해서는 문제를 해결할 수 없다.
    }
}
