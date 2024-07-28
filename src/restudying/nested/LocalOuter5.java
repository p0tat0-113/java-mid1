package restudying.nested;

/*
- 지역 클래스
지역클래스는 내부클래스의 한 종류이다. 내부클래스의 특징을 모두 가지면서 추가로 지역변수에도 접근을 할 수가 있다.
지역변수처럼 접근제어자를 사용하지 못함.
아 그리고 당연한거지만 중첩클래스들도 클래스이기 때문에 당연히 상속받고, 구현할 수 있다.
 */

public class LocalOuter5 {
    private int OuterInstanceVal = 0;

    public void process(){
        int localVal = 1;

        class LocalClass implements Printer{
            private int InnerInstanceVal = 2;

            @Override
            public void print() {
                System.out.println("InnerInstanceVal = " + InnerInstanceVal);
                System.out.println("localVal = " + localVal);
                System.out.println("OuterInstanceVal = " + OuterInstanceVal);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.print();
    }

    public static void main(String[] args) {
        LocalOuter5 localOuter5 = new LocalOuter5();
        localOuter5.process();
    }
}
