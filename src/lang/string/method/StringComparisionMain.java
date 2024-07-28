package lang.string.method;

public class StringComparisionMain {
    public static void main(String[] args) {
        //문자열 비교
        String str1 = "Hello Java";
        String str2 = "hello java";
        String str3 = "Hello World";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//대소문자를 무시하고 비교

        System.out.println("b".compareTo("a"));//1 사전적으로 몇계단 차이 나는지 알려줌
        System.out.println("c".compareTo("a"));//2 만약 반대로 돼있으면 -1,-2가 나옴.
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str2));//대소문자를 무시하고 사전적으로 몇계단 차이 나는지 알려줌

        System.out.println(str1.startsWith("Hello"));//문자열이 특정 접두사로 시작하는지 확인
        System.out.println(str1.endsWith("java"));//문자열이 특정 접미사로 끝나는지 확인
    }
}
