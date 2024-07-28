package restudying.lang.immutable2;

public class ImmutableObj2 {
    public static void main(String[] args) {
        ImmutableAddress address1 = new ImmutableAddress("서울");
        ImmutableAddress address2 = address1;//참조값을 복사해서 대입. 둘은 같은 인스턴스를 참조한다.
        System.out.println("address1.getAddress() = " + address1.getAddress());
        System.out.println("address2.getAddress() = " + address2.getAddress());

        address2.setAddress("부산");//불변 객체의 속성 변경 메서드는 새로운 객체를 반환하기 때문에 반드시 반환값을 받아야 함.
        address2 = address2.setAddress("부산");
        System.out.println("address1.getAddress() = " + address1.getAddress());
        System.out.println("address2.getAddress() = " + address2.getAddress());
        //이제는 사이드이펙트가 일어나지 않음.
        //불변이라는 단순한 제약을 사용해서 사이드 이펙트라는 큰 문제를 막을 수 있다!
    }


}
