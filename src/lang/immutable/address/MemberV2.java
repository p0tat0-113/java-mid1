package lang.immutable.address;

public class MemberV2 {
    private String name;
    private ImmutableAddress address;
    //MemverV2의 address는 불변객체인 ImmutableAddress객체를 참조한다.

    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
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
