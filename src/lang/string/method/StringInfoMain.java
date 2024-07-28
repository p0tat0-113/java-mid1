package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        //문자열 정보 조회 메서드
        String str = "Hello, Java";
        System.out.println(str.length());//길이

        System.out.println("".isEmpty());//문자열이 비어있는지
        System.out.println("      ".isBlank());//문자열이 비어있거나 공백인지

        System.out.println(str.charAt(0));//해당 인덱스의 문자 반환
    }
}
