package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder0 = new ValueAdder();

        System.out.println(adder0.add(1).add(2).add(3).getValue());
    }
}
