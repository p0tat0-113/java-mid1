package lang.immutable.address;

public class MemberV1 {
    private String name;
    private Address address;
    //MemverV1의 address는 가변객체인 Address객체를 참조한다.

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemverV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
