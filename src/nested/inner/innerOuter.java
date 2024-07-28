package nested.inner;

public class innerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    //내부 클래스는 static이 붙지 않음. 쉽게 이야기해서 인스턴스 멤버가 된다.
    class Inner{
        private int innerInstanceValue = 1;

        public void print(){
            //자기 자신에 접근
            System.out.println(innerInstanceValue);

            //바깥 클래스 인스턴스 멤버에 접근 - 가능
            System.out.println(outInstanceValue);

            //바깥 클래스 클래스 멤버에 접근 - 가능
            System.out.println(outClassValue);
        }
    }
}
