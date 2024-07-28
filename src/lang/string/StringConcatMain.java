package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        //String은 참조형이기 때문에 원래는 +같은 연산을 사용할 수 없다. 변수에 값이 아니라 참조값만 들어있기 때문
        String result1 = a.concat(b);
        String result2 = a + b;//하지만 문자열은 너무 자주 쓰기 때문에 특별히 +연산을 제공한다.
    }
}
