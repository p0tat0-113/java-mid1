package nested.test.basic;
//문제1 - - 지역 클래스를 완성해라
//실행 결과 ```
//LocalClass.hello
public class OuterClass3 {
    public void myMethod() {
        // 여기에 지역 클래스 LocalClass를 구현하고 hello() 메서드를 호출해라.
        class LocalClass{//지역 클래스는 접근제어자를 붙이지 못함. 이름그대로 local이기 때문
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }
        new LocalClass().hello();
    }
}
