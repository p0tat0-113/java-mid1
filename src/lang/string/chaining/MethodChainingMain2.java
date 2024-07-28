package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder0 = new ValueAdder();

        ValueAdder adder1 = adder0.add(1);//자기 인스턴스의 참조값을 반환함. adder1_1도 똑같은 인스턴스를 참조한다.
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);
        System.out.println(adder3.getValue());
        //이번에는 add() 메서드의 반환값을 사용
    }
}
