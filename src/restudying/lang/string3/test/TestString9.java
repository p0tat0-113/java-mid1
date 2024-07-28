package restudying.lang.string3.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성

        String[] arr = email.split("@");
        System.out.println("ID: "+arr[0]);
        System.out.println("Domain: "+arr[1]);
    }
}
