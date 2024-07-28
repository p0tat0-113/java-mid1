package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        //문자열 조작 및 변환
        String str = "Hello, Java! Welcome to Java";
        System.out.println(str.substring(7));//substring(int beginIndex, int endIndex) : 문자열의 부분 문자열을 반환한다.
        System.out.println(str.substring(7,12));//인덱스 7에서 12까지

        System.out.println(str.concat("!!!"));//문자열 더하기, 그냥 +써도 됨.

        System.out.println(str.replace("Java","World"));//특정 문자열을 새 문자열로 대체한다.
        System.out.println(str.replaceFirst("Java","World"));//첫번째 특정 문자열을 새 문자열로 대체한다.
    }
}
