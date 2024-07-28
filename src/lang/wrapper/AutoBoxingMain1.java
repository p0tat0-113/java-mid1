package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //오토 박싱, 오토 언박싱

        //Primitive -> Wrapper 오토 박싱
        int value = 7;
        Integer boxedValue = value;//원래는 Integer.valueOf(7);

        //Wrapper -> Primitive 오토 언박싱
        int unboxedValue = boxedValue;//원래는 boxedValue.intValue();

        System.out.println(boxedValue);
        System.out.println(unboxedValue);

        boxedValue += 7;//언박싱 해서 7을 더하고 다시 박싱하는 과정이 자동으로 진행된다고 함.
        System.out.println(boxedValue);
    }
}
