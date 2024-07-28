package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj mutableObj = new MutableObj(10);

        //계산 이후 기존의 값은 사라짐. 10이 30으로 변경
        mutableObj.add(20);
        System.out.println(mutableObj.getValue());
    }
}
