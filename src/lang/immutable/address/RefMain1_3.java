package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;//참조값을 그대로 복사해서 대입, 같은 인스턴스를 참조하게 됨.
        System.out.println(a);
        System.out.println(b);

        change(b,"부산");
        System.out.println(a);
        System.out.println(b);
        //딱 이 부분만 보자. 코드가 정말 복잡해진다면 이 부분만 보고 사이드이펙트 발생 가능성을 파악하기 쉽지 않다.
        //change 메서드의 구조를 보고나서야 알 수 있음.
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소를 변경합니다. -> "+changeAddress);
        address.setValue(changeAddress);
    }
}
