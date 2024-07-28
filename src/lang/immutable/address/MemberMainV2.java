package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");//주소 객체 참조

        MemberV2 memberA = new MemberV2("동우", address);
        MemberV2 memberB = new MemberV2("우동", address);

        //회원A와 회원B의 처음 주소는 모두 서울이다.
        System.out.println(memberA);
        System.out.println(memberB);

        //회원B의 주소를 부산으로 변경해야 함.
        //memberB.getAddress().setValue("부산"); //컴파일 에러 발생. ImmutableAddress는 불변객체라 값 변경 불가
        memberB.setAddress(new ImmutableAddress("부산"));//setAddress를 호출해서 새로운 ImmutableAddress객체를 넘겨줘야 함.

        System.out.println(memberA);
        System.out.println(memberB);
        //memberA와 memberB의 address가 똑같은 Address객체를 참조하고 있다.
        //따라서 둘 다 주소가 바뀌어버림. 사이드 이펙트 발생
    }
}
