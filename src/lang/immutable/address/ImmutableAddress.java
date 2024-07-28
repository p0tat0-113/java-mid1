package lang.immutable.address;

//불변 객체
//불변 객체는 내부의 상태가 변하면 안된다.
//이 클래스는 생성자를 통해서만 처음 값을 할당할 수 있고, 그 이후로는 변경 불가능
public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

//    public void setValue(String value) {
//        this.value = value;
//    } value를 final로 선언했기 때문에 변경 불가능

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
