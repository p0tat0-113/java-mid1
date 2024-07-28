package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;//참조값을 그대로 복사해서 대입, 같은 인스턴스를 참조하게 됨.
        System.out.println(a);
        System.out.println(b);

        b.setValue("부산");//b를 통해 멤버변수 값을 변경
        System.out.println(a);
        System.out.println(b);
        //a,b는 둘 다 같은 인스턴스를 가리키고 있다.
    }
}
