package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder0 = new ValueAdder();

        adder0.add(1);
        adder0.add(2);
        adder0.add(3);
        System.out.println(adder0.getValue());
        //add()메서드를 여러번 호출해서 값을 누적했다.
        //여기서는 add()메서드의 반환값(자기 인스턴스의 참조값)은 사용하지 않음.
    }
}
