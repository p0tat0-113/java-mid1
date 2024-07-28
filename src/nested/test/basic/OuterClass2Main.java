package nested.test.basic;

public class OuterClass2Main {
    public static void main(String[] args) {
        // 여기에서 InnerClass의 hello() 메서드를 호출해라
        OuterClass2.InnerClass innerClass = new OuterClass2().new InnerClass();
        innerClass.hello();
        //내부 클래스는 `바깥클래스 인스턴스.new 내부클래스()` 이렇게 해줘야 함.
    }
}
