package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        //문자열 검색 메서드
        String str1 = "Hello, Java! Welcome to Java World";

        System.out.println(str1.contains("Java"));//문자열에 특정 문자열이 포함되어 있는지 검사

        System.out.println(str1.indexOf("Java"));//문자열이 처음 등장하는 위치를 반환한다.
        System.out.println(str1.indexOf("Java",10));//지정한 인덱스부터 시작해서 문자열이 처음 등장하는 위치를 반환한다.
        System.out.println(str1.lastIndexOf("Java"));//문자열이 마지막으로 등장하는 위치를 반환한다.
    }
}
