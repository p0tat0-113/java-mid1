package lang.wrapper.test;
//문제 설명
//문자로 입력된 str1 , str2 두 수의 합을 구하자.
public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        // 코드 작성

        //문자열을 기본형 숫자로 바꾸는 데에는 이렇게 두가지 방법이 있다.
        //1.Integer가 제공하는 문자열 전용 메서드 parseInt()사용
        //2.Integer.valueOf로 박싱하고 오토언박싱
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.valueOf(str2);

        System.out.println("두 수의 합: "+(num1+num2));
    }
}
