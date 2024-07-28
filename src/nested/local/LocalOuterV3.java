package nested.local;

import java.lang.reflect.Field;

//지역 변수 캡처1
public class LocalOuterV3 {
    private int outInstanceVal = 3;

    public Printer process(int paramVar){
        int localVal = 1;//지역변수, 스택프레임이 종료되는 순간 함께 제거된다.
        //지역클래스의 인스턴스가 참조하는 지역변수는 final 이거나 사실상 final 이여야 한다.

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print(){
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVal);
                System.out.println("paramVar(local) = " + paramVar);
                System.out.println("outInstanceVal = " + outInstanceVal);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //이때 printer 는 바깥 인스턴스 객체의 참조값을 가지게 된다.

        return printer;//여기서 실행하지 않고 printer객체만 반환을 한다.
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();

        Printer printer = localOuterV1.process(2);
        //process()가 LocalPrinter 객체를 반환함. LocalPrinter 객체는 계속 참조 되어서 GC 대상이 아니게 됨.
        //process() 스택 프레임에 있던 지역변수들은 process()스택프레임이 제거되면서 함께 제거됨.

        //printer.print()를 나중에 실행한다. localOuterV1.process() 스택 프레임이 제거된 후에 실햄함.
        printer.print();
        //바깥 인스턴스의 인스턴스 변수에 접근하는 것은 문제가 없다. 바깥 인스턴스의 참조값을 가지고 있기 때문.
        //지역변수는 스택프레임이 사라질 때 같이 없어짐, 그런데 지역변수들에 어떻게 접근을 한걸까?

        //추가 - 필드 확인
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
