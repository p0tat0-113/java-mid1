package nested.anonymous.ex;

import java.util.Random;

//코드 중복을 줄여야 함. 이건 다형성 쓸 각이 딱 보이네.
public class Ex1Main {
    public static void helloDice() {
        System.out.println("프로그램 시작");//변하지 않는 부분

        //코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;//1에서 6까지 랜덤으로 반환
        System.out.println("주사위 = " + randomValue);
        //코드 조각 종료

        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");//변하지 않는 부분

        //코드 조각 시작
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        //코드 조각 종료

        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
