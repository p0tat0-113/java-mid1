package restudying.lang.string3;

public class StringBasic1 {
    public static void main(String[] args) {
        //String을 선언하는 방법에는 이렇게 2가지가 있다.
        String str1 = "Hello World";//문자열 리터럴로 선언. 자바에서 그냥 기본형처럼 선언할 수 있게 편의 제공
        String str2 = new String("Hello World");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        //String은 클래스이기 때문에 당연히 속성과 기능을 가지고 있다.
        //내부적으로 문자열을 char[] 혹은 byte[]로 저장한다. 자바 9 버전 이후부터는 byte[]를 써서 최적화함.
        //기본형 변수들은 약간 죽어있는 느낌이고, String 클래스는 객체로써 살아있는 느낌

        //String 변수는 참조형이기 때문에 원래는 + 연산같은걸 할 수 없다. 그렇지만 자바에서 특별히 편의기능을 제공함.
        String str3 = str1+str2;
        String str4 = str1.concat(str2);//문자열을 더하는 concat()메서드
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
    }
}
