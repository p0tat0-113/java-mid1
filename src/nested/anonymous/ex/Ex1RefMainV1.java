package nested.anonymous.ex;

import java.util.Random;

//여기서는 단순한 데이터를 전달하는 수준을 넘어서 코드 조각을 넘겨야 한다.

//코드 중복을 줄여야 함. 이건 다형성 쓸 각이 딱 보이네.
//다형적 참조로 한 메서드가 여러 타입의 인스턴스를 받고, 오버라이딩 된 메서드가 호출되게끔 하면 되겄네
public class Ex1RefMainV1 {
    private static void hello(Process process) {//다형적 참조
        System.out.println("프로그램 시작");//변하지 않는 부분
        //코드 조각 시작
        process.run();//메서드 오버라이딩
        //코드 조각 종료
        System.out.println("프로그램 종료");//변하지 않는 부분

        //다형적 참조로 객체를 전달받고, 오버라이딩된 메서드를 실행
        //Process 인터페이스를 구현하지 않은 객체는 인수로 받아지지도 않음.
    }

    //얘네 둘은 여기서만 쓰이는 클래스라서, 별도의 파일이 아닌 정적 중첩 클래스로 만들었다.
    private static class Dice implements Process{
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;//1에서 6까지 랜덤으로 반환
            System.out.println("주사위 = " + randomValue);
        }
    }

    private static class Sum implements Process{
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();
        hello(dice);
        hello(sum);

        //JS나 파이썬에서 하던 것처럼 메서드만 변수에 담아서 매개변수로 넘길 수 있다면 좋을텐데
        //내가 이제까지 자바에서 배운 걸로는 그런걸 할 수가 없었음.
        //그래서 인터페이스를 선언하고, 구현클래스를 선언하고, 그 클래스의 인스턴스를 생성해서 hello 메서드의 인수로 넘기면
        //hello 메서드 안에서 인스턴스의 메서드를 호출하는 식으로 구현함.
    }
}
