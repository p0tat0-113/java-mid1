package enumeration.ref1;

public class ClassGrade {
    //회원의 등급별로 할인율이 정해지기 때문에 회원의 등급 자체가 할인율을 갖도록 할 것이다.
    //내부적으로만 생성자를 호출해서 discountPercent를 초기화한다.
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;
    //final, 불변으로 선언함으로써 변수가 변경되면 안된다는 의도를 명확하게 하고,
    //값을 변경하는 메서드를 만들시 컴파일 에러를 발생시켜서 실수를 방지할 수 있다.

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
