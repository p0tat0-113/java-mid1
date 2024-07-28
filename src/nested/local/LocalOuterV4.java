package nested.local;

public class LocalOuterV4 {
    private int outInstanceVal = 3;

    public Printer process(int paramVar){
        int localVal = 1;
        //지역클래스의 인스턴스가 참조하는 지역변수는 final 이거나 사실상 final 이여야 한다.

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print(){
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVal);
                System.out.println("paramVar(local) = " + paramVar);
                System.out.println("outInstanceVal = " + outInstanceVal);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //만약 localVal의 값을 변경한다면? 캡처를 다시 해야 하나??
        //localVal = 10;//컴파일 에러 발생 Variable 'localVal' is accessed from within inner class, needs to be final or effectively final
        //만약 지역 클래스의 인스턴스가 참조하는 지역변수의 값을 바꿀 수 있게 하면 여러가지 문제가 터질 수 있기 때문에
        //자바는 그냥 그걸 못하게 문법적으로 막음.
        //정 필요하면 그냥 지역변수를 따로 하나 만들면 그만임.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV4 = new LocalOuterV4();
        Printer printer = localOuterV4.process(2);
        printer.print();
    }
}
