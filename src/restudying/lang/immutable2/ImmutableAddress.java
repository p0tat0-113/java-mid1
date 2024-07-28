package restudying.lang.immutable2;

public class ImmutableAddress {
    private final String address;//가변 객체

    public ImmutableAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public ImmutableAddress setAddress(String address) {
        return new ImmutableAddress(address);//불변 객체이기 때문에 속성을 변경하는 것은 안됨. 새로운 값을 넣은 새로운 객체를 반환해야 한다.
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
