package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello Java!";

        //valueOf 메서드
        String numStr = String.valueOf(num);//다양한 타입을 문자열로 반환함.
        System.out.println(numStr);

        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(obj));//내부적으로 객체의 toString()메서드를 호출함. 그래서 지금같은 경우 참조값이 출력됨.

        //문자 + 숫자 -> 숫자
        System.out.println(("" + 100));//타입이 문자열로 바뀜. valueOf외에도 이렇게도 많이 쓴다고 함.
        System.out.println(("" + 100) instanceof String);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();//문자열을 문자배열로 변환
        for (char c : strCharArray) {
            System.out.println(c);
        }
    }
}
