package lang.immutable.address;

public class RefMain1_4 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;//참조값 대입을 막을 수 있는 방법은 없음.
        System.out.println(a);
        System.out.println(b);

        //b.setValue("부산");//setValue로 값을 바꾸려고 하면 컴파일 에러 발생.
        b = new ImmutableAddress("부산");//ImmutableAddress는 불변객체이므로 새롭게 인스턴스를 생성해서 할당해야 한다.
        System.out.println(a);
        System.out.println(b);
        //a,b는 둘 다 같은 인스턴스를 가리키고 있다.
    }
}
