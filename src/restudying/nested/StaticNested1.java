package restudying.nested;

/*
- 정적 중첩 클래스
정적 중첩 클래스는 극단적으로 보자면 바깥 클래스와 그냥 남남 관계이다.
인스턴스를 생성해보면 둘은 아무런 연결고리가 없는 완전 별개의 인스턴스들이 뿐이다.
다만 정적 중첩 클래스 선언 위치 상 바깥 클래스의 private 멤버에도 접근을 할 수 있다는 것 뿐임.

중첨 클래스는 클래스가 다른 한 클래스에서만 쓸일 때 주로 사용한다.
*논리적 그룹화 : 한 클래스에서만 쓰이는 클래스를 중첩시키면 패키지가 깔끔해짐. 쓰는 사람으로 하여금 헷갈리지 않음.
*캡슐화: 중첩 클래스는 바깥 클래스의 private 멤버에 접근할 수 있음. 그래서 불필요한 public 을 줄일 수가 있음.
 */

public class StaticNested1 {
    private static String outerStaticVal = "outerStaticVal";
    private String outerInstanceVal = "outerInstanceVal";

    static class Nested{
        private String innerInstanceVal = "innerInstanceVal";

        void print(){
            System.out.println("innerInstanceVal = " + innerInstanceVal);
            System.out.println("outerStaticVal = " + outerStaticVal);
            //System.out.println("outerInstanceVal = " + outerInstanceVal);//static 이기 때문에 당연히 인스턴스 멤버에는 접근하지 못함.
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
        System.out.println("nested = " + nested);//중첩클래스는 $로 구분해서 표시됨
    }
}
