package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();//모든 ENUM 상수를 포함하는 배열을 반환한다.

        System.out.println(Arrays.toString(values));//Arrays클래스가 제공하는 static메서드 toString. 배열의 참조값이 아니라 배열 내부의 값을 출력

        for (Grade value : values) {
            System.out.println(value.name() +" | "+value.ordinal());//.ordinal()정의한 순서를 받을 수 있음.
        }

        //String -> ENUM 변환
        String input = "GOLD";
        //input = "wrong";//잘못된 문자열을 넣으면 런타임 에러 발생
        Grade grade = Grade.valueOf(input);//주어진 이름과 일치하는 ENUM 상수를 반환. 래퍼클래스에서는 기본형 혹은 문자열을 래퍼클래스로 변환하는데 썼던 메서드
        System.out.println(grade);//참조값이 아닌 GOLD가 출력되는건 Enum 클래스에서 toString()을 오버라이딩 했기 때문
    }
}
