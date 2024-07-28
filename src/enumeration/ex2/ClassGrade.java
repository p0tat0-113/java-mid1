package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
    //회원 등급을 다루는 클래스를 만들고 각각의 회원 등급별로 상수를 선언한다.
    //각각의 상수마다 별도의 인스턴스를 생성하게 해서 각각에 대입한다.
    //각 상수는 static final로 선언되어서 메서드 영역에 단 1개만 존재하고, 참조하는 인스턴스를 변경할 수 없다.

    private ClassGrade(){}

    //이렇게 생성자까지 private 처리하면 '타입 안전 열거형 패턴'의 완성이다.
    //어떤 타입을 정의하고, 그 타입을 사용할 때는 클래스내에 열거되어있는 상수만 사용할 수 있게 하는 것
}
