package nested;
//바깥 클래스의 변수 이름과 내부 클래스의 변수 이름이 같으면?
public class ShadowingMain {
    public int value = 1;

    private class Inner {
        public int value = 2;

        public void print(){
            int value = 3;

            System.out.println("value = " + value);//지역변수
            System.out.println("this.value = " + this.value);//Inner의 인스턴스 변수
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value);//ShadowingMain의 인스턴스 변수
            System.out.println(ShadowingMain.this);
            //ShadowingMain.this 는 ShadowingMain의 인스턴스를 가리킴
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.print();
    }
}
