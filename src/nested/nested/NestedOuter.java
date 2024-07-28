package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {//정적 중첩 클래스
        private int nestedInstanceValue = 1;

        public void print(){
            //자신의 멤버에 접근 - 당연히 됨.
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근 - 불가
            //System.out.println(outInstanceValue);//static은 당연히 인스턴스멤버에 접근하지 못함.

            //바깥 클래스의 클래스 멤버에는 접근 - 가능. private 이어도 접근 가능!! 둘 다 같은 클래스에 있으니까
            System.out.println(outClassValue);
        }
    }
}
