package lang.string.chaining;

public class ValueAdder {
    //메서드 체이닝
    public int value;
    public ValueAdder add(int addValue){
        value += addValue;
        return this;//자기 자신의 참조값을 반환
    }

    public int getValue() {
        return value;
    }
}
