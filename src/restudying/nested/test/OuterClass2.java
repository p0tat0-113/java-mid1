package restudying.nested.test;

public class OuterClass2 {
    class InnerClass{
        public void hello(){
            System.out.println("InnerClass.hello");
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OuterClass2().new InnerClass();
        innerClass.hello();
    }
}
