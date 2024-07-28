package restudying.lang.string3.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성

        String fileName = str.substring(0,str.indexOf(ext));
        System.out.println("fileName = " + fileName);
        System.out.println("ext = " + ext);
    }
}
