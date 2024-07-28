package lang.string.test;

//문제 설명
//split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성
        String[] strings = email.split("@");//@를 기준으로 문자열을 분리
        System.out.println("ID: "+strings[0]);
        System.out.println("Domain: "+strings[1]);
    }
}
