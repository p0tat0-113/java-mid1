package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {
    private static void hello(Process process) {
        System.out.println("프로그램 시작");//변하지 않는 부분
        //코드 조각 시작
        process.run();//메서드 오버라이딩
        //코드 조각 종료
        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void main(String[] args) {
        //v4에서 익명함수로 만들어놨던 것을 alt + enter 누르면 자동으로 lambda 로 바꿔줌ㄷㄷ

        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;//1에서 6까지 랜덤으로 반환
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });

        //코드를 보면 클래스나 인스턴스를 정의하지 않고, 메서드(더 정확히는 함수)의 코드 블럭을 직접 전달하는 것을 확인할 수 있다.
        //람다 전에는 익명 클래스를 섰다고 한다.

    }
}
