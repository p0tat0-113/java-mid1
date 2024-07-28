package lang.math;

public class MathMain {
    public static void main(String[] args) {
        //기본 연산 메서드
        System.out.println("max: "+Math.max(10,20));
        System.out.println("min: "+Math.min(10,20));
        System.out.println("abs: "+Math.abs(-10));//절대값

        //반올림 및 정밀도 메서드
        System.out.println("ceil: "+Math.ceil(2.1));//올림
        System.out.println("floor: "+Math.floor(2.1));//내림
        System.out.println("round: "+Math.round(2.5));//반올림

        //기타 유용한 메서드
        System.out.println("sqrt: "+Math.sqrt(4));//제곱근
        System.out.println("random: "+Math.random());//0.0~1.0사이의 double값
        //Math.ramdom도 내부적으로는 Random클래스를 사용한다고 함.
    }
}
