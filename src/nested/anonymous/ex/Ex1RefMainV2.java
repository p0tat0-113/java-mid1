package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {
    private static void hello(Process process) {
        System.out.println("프로그램 시작");//변하지 않는 부분
        //코드 조각 시작
        process.run();//메서드 오버라이딩
        //코드 조각 종료
        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void main(String[] args) {
        //V1에서는 정적 중첩 클래스로 쓰던 것들을 main 메서드 안에서 지역 클래스로 들고왔음.

        class Dice implements Process{
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;//1에서 6까지 랜덤으로 반환
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements Process{
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        //근에 얘네들 어차피 한번만 생성해서 간단하게 쓰고 있기 때문에 그냥 익명클래스로 바꿔버릴 수도 있다.
        Dice dice = new Dice();
        Sum sum = new Sum();
        hello(dice);
        hello(sum);
    }
}
