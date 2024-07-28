package lang.string.test;

//문제 설명
//str 에는 파일의 이름과 확장자가 주어진다. ext 에는 파일의 확장자가 주어진다.
//파일명과 확장자를 분리해서 출력하라.
//indexOf() 와 substring() 을 사용해서 문제를 풀면 된다.

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성

        String filename = str.substring(0,str.indexOf(ext));
        System.out.println("filename = "+filename);
        System.out.println("extName = "+ext);
    }
}
