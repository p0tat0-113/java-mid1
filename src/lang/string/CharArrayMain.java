package lang.string;

public class CharArrayMain {
    public static void main(String[] args) {
        char a = '가';//문자 하나는 char, 2바이트

        char[] charArr = new char[]{'h','e','l','l','o'};//여러 문자를 나열하려면 배열로 선언해야 함. 존나 불편함.
        System.out.println(charArr);

        String str = "hello";//그냥 String 쓰는게 편함.
        System.out.println(str);
    }
}
