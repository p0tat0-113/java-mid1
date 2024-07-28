package nested.test.basic;
//문제1 - 내부 클래스를 완성해라
//실행 결과 ```
//InnerClass.hello
public class OuterClass2 {
    // 여기에 InnerClass를 구현해라. 그리고 hello() 메서드를 만들어라
    private int num;
    class InnerClass {
        public void hello(){
            System.out.println("InnerClass.hello");
        }
    }
}
