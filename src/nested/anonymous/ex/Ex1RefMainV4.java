package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {
    private static void hello(Process process) {
        System.out.println("프로그램 시작");//변하지 않는 부분
        //코드 조각 시작
        process.run();//메서드 오버라이딩
        //코드 조각 종료
        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void main(String[] args) {
        //V3에서 익명클래스의 인스턴스 참조값을 변수에 따로 담았던 것을 하지않고, 그냥 바로 인수로 넣어버림

        hello(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;//1에서 6까지 랜덤으로 반환
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });

        //근데 여기서 한발자국 더 나아갈거임, 지금 이 코드에서의 목적은 인스턴스가 아니라 저 run()메서드들 안에 있는 코드 조각을 넘기는 것이기 때문.
        //지금처럼 코드 조각을 전달하기 위해 클래스를 정의하고 메서드를 만들고 또 인스턴스를 꼭 생성해서 전달해야 할까?
        //생각해보면 클래스나 인스턴스와 관계 없이 다음과 같이 메서드만 전달할 수 있다면 더 간단하지 않을까?
        //파이썬... 자바스크립트... 그립읍니다...
    }
}
