package restudying.nested;

import nested.local.Printer;

public class AnonymousOuter7 {
    private int OuterInstanceVal = 0;

    public void process(){
        int localVal = 1;

        /*class LocalClass implements Printer{
            private int InnerInstanceVal = 2;

            @Override
            public void print() {
                System.out.println("InnerInstanceVal = " + InnerInstanceVal);
                System.out.println("localVal = " + localVal);
                System.out.println("OuterInstanceVal = " + OuterInstanceVal);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.print();*/
        //원래는 이렇게 지역클래스를 선언하고, 인스턴스를 생성까지 해야 메서드를 쓸 수가 있었다.
        //근데 어차피 메서드 안에서 한 번만 쓰고 말려는건데 너무 귀찮어.
        //이때 익명클래스를 쓰면 선언과 생성을 한 번에 할 수 있다.

        Printer printer = new Printer() {
            private int InnerInstanceVal = 2;

            @Override
            public void print() {
                System.out.println("InnerInstanceVal = " + InnerInstanceVal);
                System.out.println("localVal = " + localVal);
                System.out.println("OuterInstanceVal = " + OuterInstanceVal);
            }
        };
        printer.print();
        //익명클래스는 `new 부모클래스,인터페이스 () {body}` 형식으로 선언한다.
        //반드시 부모클래스를 상속받거나, 인터페이스를 구현해야만 한다.
        //익명클래스는 이름이 없기 때문에 기본생성자 외에는 갖지 못한다.

        //별도의 선언 및 생성과정 없이 즉석에서 인터페이스를 구현할 수 있기 때문에 코드가 간결해진다.
        //복잡하거나 재사용이 필요한 경우 별도의 클래스를 정의하는 것이 좋다.
        // 지역 클래스는 일회성으로 사용되거나, 간단한 구현을 제공할 때 사용한다.
    }

    public static void main(String[] args) {
        AnonymousOuter7 anonymousOuter7 = new AnonymousOuter7();
        anonymousOuter7.process();
    }
}
