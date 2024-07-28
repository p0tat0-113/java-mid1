package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String == 비교: "+ (str1 == str2));//str1과 str2는 서로 다른 인스턴스이기 때문에 당연히 참조값이 다르다. 동일하지 않음.
        System.out.println("new String equals 비교: "+str1.equals(str2));//String에서 오버라이딩한 equals는 안에 들어있는 문자열이 같으면 동등하다고 정의하고 true를 반환함.

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: "+ (str3 == str4));//둘이 동일함.. 왜지? 바로 문자열 풀을 이용하기 때문이다.
        System.out.println("리터럴 equals 비교: "+str3.equals(str4));
    }
}
