package restudying.lang.immutable2;

public class MemberV1Main {
    public static void main(String[] args) {
        Address address = new Address("서울");//가변 객체

        MemberV1 member1 = new MemberV1("동우", address);
        MemberV1 member2 = new MemberV1("우동", address);//둘은 지금 같은 address 가변객체를 참조하고 있음

        System.out.println(member1);
        System.out.println(member2);

        member1.getAddress().setAddress("부산");//사이드 이펙트 발생
        System.out.println(member1);
        System.out.println(member2);
    }
}
