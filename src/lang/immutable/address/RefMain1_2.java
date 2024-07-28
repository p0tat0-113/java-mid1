package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println(a);
        System.out.println(b);

        b.setValue("부산");//b를 통해 멤버변수 값을 변경
        System.out.println(a);
        System.out.println(b);
        //a,b는 둘 다 같은 인스턴스를 가리키고 있다.
    }
}
