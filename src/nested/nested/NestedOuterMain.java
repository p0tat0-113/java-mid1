package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter nestedOuter = new NestedOuter();

        //Nested는 static이라서 위 NestedOuter 인스턴스랑은 아무런 관계가 없다. 그냥 NestedOuter.Nested 로 접근 가능
        //말 그대로 진짜 'nested'일 뿐이다. 'inner'와는 다른 개념임.
        //조금 극단적으로 설명하자면 둘은 그냥 남남이다. 다만 안쪽 클래스가 바깥 클래스의 private에 접근할 수 있다는 것 뿐
        NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();

        System.out.println("nestedClass: "+nested.getClass());
        //class nested.nested.NestedOuter$Nested 중첩클래스는 달러로 구분 하는 듯
    }
}
