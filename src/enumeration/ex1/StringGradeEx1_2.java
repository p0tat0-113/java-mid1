package enumeration.ex1;

//앞에서 만든 단순히 문자열을 입력하는 방식은, 오타가 발생하기 쉽고, 유효하지 않는 값이 입력될 수 있다.
//다음 예를 보자.
public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        //소문자 - 데이터 일관성 부족
        int gold = discountService.discount("gold",price);

        //오타 - 타입 안정성 부족
        int diamond = discountService.discount("DIAMONDDD",price);

        //존재 하지 않는 등급 - 타입 안정성 부족
        int vip = discountService.discount("VIP",price);

        System.out.println(gold);
        System.out.println(diamond);
        System.out.println(vip);

        //문자열 상수를 쓴다고 해도 문제가 근본적으로 해결되지는 않음.
        //쓰는 사람 입장에서는 discount메서드가 String을 인수로 받기 때문에 그냥 막 쳐서 넣을 수가 있다.
        //결국 누군가 주석을 잘 남겨두어서, StringGrade 에 있는 상수를 사용해달라고 해야 한다.
        //물론 이렇게 해도 누군가는 주석을 깜박하고 문자열을 직접 입력할 수 있다.
    }
}
