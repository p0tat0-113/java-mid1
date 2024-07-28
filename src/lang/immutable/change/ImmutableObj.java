package lang.immutable.change;

public class ImmutableObj {
    //불변 객체에서 add메서드 구현
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        return new ImmutableObj(value+addValue);
        //불변 객체는 값을 바꾸는게 불가능하기 때문에 이렇게 새로운 객체를 만들어 값을 할당해서 반환한다.
        //이렇게 하면 불변도 유지하면서 새로운 결과를 만들 수도 있다.
    }

    public int getValue() {
        return value;
    }
}
