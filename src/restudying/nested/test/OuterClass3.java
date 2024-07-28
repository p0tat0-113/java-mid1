package restudying.nested.test;

public class OuterClass3 {
    public void myMethod(){
        class LocalClass{
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }
        new LocalClass().hello();
    }

    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.myMethod();
    }
}
