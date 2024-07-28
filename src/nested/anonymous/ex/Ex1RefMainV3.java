package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {
    private static void hello(Process process) {
        System.out.println("프로그램 시작");//변하지 않는 부분
        //코드 조각 시작
        process.run();//메서드 오버라이딩
        //코드 조각 종료
        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void main(String[] args) {
        //V2에서 지역클래스로 끌고 온 것을 이제는 그냥 익명클래스로 바꿔버림. 한 번만 생성해서 간단하게 쓰고 있었기 때문

        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;//1에서 6까지 랜덤으로 반환
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);

    }
}
