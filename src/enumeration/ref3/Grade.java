package enumeration.ref3;

public enum Grade {
    //public static final Grade BASIC = new Grade(10);
    BASIC(10),GOLD(20),DIAMOND(30),LEGEND(40);
    //상수 뒤에 괄호를 붙여서 생성자에 인수를 넘겨주면 적당한 생성자가 호출된다.

    private final int discountPercent;

    //열거형은 상수로 지정하는 것 외에 일반적인 방법으로 생성이 불가능하다. private 이라고 생각하면 됨.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //열거형도 클래스이기 때문에 메서드를 만들 수 있다.
    public int getDiscountPercent() {
        return discountPercent;
    }

    public int discount(int price){
        return price * discountPercent / 100;
    }
}
