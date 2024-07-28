package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        //문자열 조작 및 변환
        String strWithSpace = "    java Programming    ";

        System.out.println(strWithSpace.toLowerCase());//소문자로 변환
        System.out.println(strWithSpace.toUpperCase());//대문자로 변환

        System.out.println(strWithSpace.trim());//문자열 양쪽 끝의 공백을 제거. Whitespace만 제거한다.
        System.out.println(strWithSpace.strip());//문자열 양쪽 끝의 공백을 제거. Whitespace와 유니코드 공백을 포함해서 제거한다. 자바11부터 지원
        System.out.println(strWithSpace.stripLeading());//문자열 앞 공백 제거
        System.out.println(strWithSpace.stripTrailing());//문자열 뒷 공백 제거


    }
}
