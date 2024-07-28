package nested.test.basic;
//문제1 - 정적 중첩 클래스를 완성해라
//실행 결과 ```
//NestedClass.hello
public class OuterClass1 {
    //야기에 NestedClass를 구현해라. 그리고 hello() 메서드를 만들어라.
    static class NestedClass{
        public void hello(){
            System.out.println("NestedClass.hello");
        }
    }
}
