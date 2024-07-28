package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");//주소 객체 참조

        MemberV1 memberA = new MemberV1("동우", address);
        MemberV1 memberB = new MemberV1("우동", address);

        //회원A와 회원B의 처음 주소는 모두 서울이다.
        System.out.println(memberA);
        System.out.println(memberB);

        //회원B의 주소를 부산으로 변경해야 함.
        memberB.getAddress().setValue("부산");
        //getAddress()로 멤버변수 address가 참조하고 있는 Address객체를 가져오고,
        //Address의 setValue()를 호출해서 주소를 변경함.

        System.out.println(memberA);
        System.out.println(memberB);
        //memberA와 memberB의 address가 똑같은 Address객체를 참조하고 있다.
        //따라서 둘 다 주소가 바뀌어버림. 사이드 이펙트 발생
    }
}
