package restudying.lang.string3.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // 코드 작성
        String fileName = str.substring(0,5);
        System.out.println("fileName = " + fileName);
        String extName = str.substring(5);
        System.out.println("extName = " + extName);
    }
}
