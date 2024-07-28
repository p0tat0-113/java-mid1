package nested.anonymous;

import nested.local.Printer;
//LocalOuterV2 와 완전히 같은 코드이다. 여기서는 익명 클래스를 사용
public class AnonymousOuter {
    private int outInstanceVal = 3;

    public void process(int paramVar){
        int localVal = 1;

        //원래는 Printer 인터페이스를 구현하는 LocalPrinter 클래스를 선언하고, 따로 생성했는데
        //지금은 선언과 생성을 합쳐버림.
        //인터페이스를 구현하면서 인터페이스의 구현체를 이름 없이 만들어버리고, 바로 생성.

        //new 다음에 바로 상속받으면서 구현 할 부모 타입을 입력하며 된다.
        //마치 인터페이스의 인스턴스를 생성하는 것처럼 보이지만, 실제로는 인터페이스를 구현하는 익명클래스를 구현하는 것.
        Printer printer = new Printer() {
            //이 코드블럭이 익명 클래스의 body가 된다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVal);
                System.out.println("paramVar(local) = " + paramVar);
                System.out.println("outInstanceVal = " + outInstanceVal);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
        //익명클래가 하나만 있어서 $1 이렇게 나온다고 함. 하나 더 있으면 $2
    }

    public static void main(String[] args) {
        AnonymousOuter localOuterV1 = new AnonymousOuter();
        localOuterV1.process(2);
    }
}
