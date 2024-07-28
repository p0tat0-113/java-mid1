package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        //String 클래스를 통해 문자열을 생성하는 방법은 2가지가 있음.

        String str1 = "hello";//String은 특별하다. 문자열은 매우 특별하기 때문에 쌍따옴표로 감싸기만 해도 아래 코드 같이 바꿔줌.
        //이렇게 선언하는 경우 실제로는 성능 최적화를 위해 문자열 풀을 사용하는데, 이에 대해서는 뒤에서 설명해준다고 함.

        String str2 = new String("hello");//String은 참조형이고 클래스이기 때문에 이렇게 선언할 수도 있음.

        System.out.println(str1);
        System.out.println(str2);


        String str1_1 = "Hello";
        String str1_2 = "Hello";
        String str2_1 = new String("Hello");
        String str2_2 = new String("Hello");

        System.out.println(str1_1 == str1_2);//true
        System.out.println(str2_1 == str2_2);//false
        //위 코드의 결과가 문자열 풀과 밀접한 연관이 있다고 함.
    }
}
