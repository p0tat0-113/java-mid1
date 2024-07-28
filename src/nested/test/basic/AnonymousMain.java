package nested.test.basic;
//문제4 - 익명 클래스를 완성해라
//실행 결과 ```
//Hello.hello
public class AnonymousMain {
    public static void main(String[] args) {
        // 여기에서 Hello의 익명 클래스를 생성하고 hello()를 호출해라.
        Hello hello = new Hello() {//익명 클래스는 인터페이스 구현과 인스턴스 생성을 동시에 함
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}
