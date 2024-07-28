package enumeration.ex3;

public enum Grade {
    BASIC,GOLD,DIAMOND

    //자바는 타입 안전 열거형 패턴을 편리한게 사용할 수 있는 열거형(Enum Type)을 제공한다.
    //앞서 정의한 StringGrade 코드와 거의 같다.
    //열거형도 클래스고, 자동으로 java.lang.Enum 을 상속 받는다.
    //외부에서 임의로 생성할 수 없다.

    //열거형도 클래스인데, 열거형을 제공하기 위해 제약이 추가된 클래스라고 생각하면 된다.
}
