package restudying.lang.immutable2;

/*
기본형과 참조형

자바의 대원칙: 값을 대입할 때는 항상 복사해서 집어넣는다.
기본형은 값을 절대로 공유하지 않는다.
참조형은 참조값을 여러 변수에서 공유할 수 있다.
 */

public class RefMain1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //기본형은 값을 공유하지 않음을 확인할 수 있다.

        Address address1 = new Address("서울");
        Address address2 = address1;//참조값을 복사해서 대입. 둘은 같은 인스턴스를 참조한다.
        System.out.println("address1.getAddress() = " + address1.getAddress());
        System.out.println("address2.getAddress() = " + address2.getAddress());

        address2.setAddress("부산");//사이드이펙트 발생
        System.out.println("address1.getAddress() = " + address1.getAddress());
        System.out.println("address2.getAddress() = " + address2.getAddress());
        /*
        address2에 address1의 참조값을 복사해서 대입함. 둘은 같은 참조값을 공유하고 있다.
        그래서 한쪽으로 접근해서 값을 바꾸면 다른 쪽에서도 값이 바뀌어버리는 사이드이펙트가 발생함.

        이 문제를 해결하려면 참조값을 공유하지 않게 하면 된다.
        그런데 자바 문법상 객체를 공유하는 것을 강제로 막을 수 있는 방법이 없다.
        개발자가 아무리 조심을 해도 언제나 실수를 하기 마련이다. 사이드이펙트로 인한 버그는 잡기가 상당히 까다로움.

        이 문제의 근본적인 원인은 공유된 객체의 속성을 바꾸는 것에 있다.
        이 문제를 해결하려면 객체의 속성을 어떻게든 바꾸지 못하게 하면 된다. 이것이 바로 불변객체이다.
         */
    }
}
