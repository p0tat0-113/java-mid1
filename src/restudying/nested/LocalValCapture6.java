package restudying.nested;

import java.lang.reflect.Field;

public class LocalValCapture6 {
    private int OuterInstanceVal = 0;

    public Printer process(){
        int localVal = 1;//지역 클래스가 접근하는 지역변수들은 final 이거나 사실상 final 이어야 한다.

        class LocalClass implements Printer{
            private int InnerInstanceVal = 2;

            @Override
            public void print() {
                System.out.println("InnerInstanceVal = " + InnerInstanceVal);
                System.out.println("localVal = " + localVal);
                System.out.println("OuterInstanceVal = " + OuterInstanceVal);
            }
        }
        LocalClass localClass = new LocalClass();
        return localClass;//생성한 인스턴스의 참조값을 밖으로 던져서, 지역변수들 보다 더 오래 살아남게 함.
    }

    public static void main(String[] args) {
        LocalValCapture6 localValCapture6 = new LocalValCapture6();
        Printer printer = localValCapture6.process();//process()메서드 안에서 생성된 지역 클래스의 인스턴스 참조값을 받아냄.

        printer.print();

        for (Field declaredField : printer.getClass().getDeclaredFields()) {
            System.out.println(declaredField);
        }


        /*
        지금 코드를 보면 process()메서드가 지역클래스 인스턴스를 생성하고 리턴했다. process()메서드는 종료되고, 스택프레임이 제거되면서 지역변수들도 함께 사라짐.
        그리고 나서 지역 인스턴스의 메서드를 실행하는데 이상하게도 이미 없어진 지역변수들에도 접근을 할 수가 있네? 이게 어떻게 가능한 것일까?

        그 이유는 지역 인스턴스가 생성될 때 참조하는 지역변수들을 다 '캡처'해서 인스턴스 안에 저장해두기 때문이다.
        지역변수를 참조할 때는 스택프레임에 있는 것이 아니라, 자기 인스턴스 안에 저장해 둔 캡쳐변수를 참조함. 캡쳐변수의 생애주기는 그 인스턴스의 생애주기와 같다.
        그리고 지역 인스턴스가 참조하는 지역변수들은 인스턴스 생성 후 값이 변경될 시 동기화문제가 발생을 하기 때문에 final, 혹은 사실상 final 이어야 한다.

        printer.getClass().getDeclaredFields()로 캡처변수를 직접 확인해 볼 수 있다.
         */
    }
}
