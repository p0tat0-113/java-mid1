package restudying.lang.immutable2;

public class MemberV2Main {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");//불변 객체

        MemberV2 member1 = new MemberV2("동우", address);
        MemberV2 member2 = new MemberV2("우동", address);//둘은 지금 같은 ImmutableAddress 불변객체를 참조하고 있음

        System.out.println(member1);
        System.out.println(member2);

        member1.getAddress().setAddress("부산");//불변 객체의 변경 메서드 특성상 반환값을 받지 않으면 아무 일도 일어나지 않음.
        member1.setAddress(new ImmutableAddress("부산"));//결국 주소를 바꾸려면 아예 새로운 ImmutableAddress 객체를 생성해서 집어넣는 방법밖에 없음.
        System.out.println(member1);
        System.out.println(member2);
        //사이드 이펙트 발생하지 않음.
    }
}
