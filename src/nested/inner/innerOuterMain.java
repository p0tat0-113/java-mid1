package nested.inner;

public class innerOuterMain {
    public static void main(String[] args) {
        innerOuter outer1 = new innerOuter();
        innerOuter outer2 = new innerOuter();
        innerOuter outer3 = new innerOuter();

        //어느 인스턴스에 소속될지 정해줘야 한다. 바깥 인스턴스의 소속이 됨.
        innerOuter.Inner inner = outer1.new Inner();//바깥 클래스의 인스턴스 변수에도 접근을 하려면 바깥 인스턴스의 참조값을 알아야 한다.
        //내부 클래스는 바깥 클래스의 인스턴스에 소속되어야 한다. 따라서 내부 클래스를 생성할 때, 바깥 클래스의 인스턴스 참조가 필요하다.
        //개념상 바깥 클래스의 인스턴스 내부에서 내부 클래스의 인스턴스가 생성된다.
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
