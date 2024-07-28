package restudying.nested;

/*
- 내부 클래스
내부 클래스는 진짜로 바깥 클래스의 인스턴스 소속이다. 그래서 바깥 클래스의 인스턴스 멤버에도 접근을 할 수가 있다.
개념적으로는 바깥 클래스 인스턴스 안에 내부 클래스의 인스턴스가 생성됨.
그런데 실제로는 인스턴스가 따로따로 이긴 하지만 내부 인스턴스가 바깥 인스턴스의 참조값을 가지고 있어서 바깥 인스턴스의 인스턴스 멤버에 접근할 수 있다.
 */

public class InnerClass3 {
    private static String outerStaticVal = "outerStaticVal";
    private String outerInstanceVal = "outerInstanceVal";

    class Nested{
        void print(){
            System.out.println("outerStaticVal = " + outerStaticVal);
            System.out.println("outerInstanceVal = " + outerInstanceVal);
        }
    }

    public static void main(String[] args) {
        //내부 인스턴스는 바깥 인스턴스의 소속이기 때문에, 생성하려면 먼저 바깥 인스턴스가 생성되어 있어야 한다.
        Nested nested = new InnerClass3().new Nested();
        nested.print();
    }
}
