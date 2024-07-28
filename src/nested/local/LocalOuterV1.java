package nested.local;
//지역 클래스. 지역 변수와 같은 블록에서 선언
public class LocalOuterV1 {
    private int outInstanceVal = 3;

    public void process(int paramVar){
        int localVal = 1;

        //지역 클래스는 지역 변수처럼 접근제어자를 사용할 수 없다.
        class LocalPrinter{
            int value = 0;

            public void printData(){
                System.out.println("value = " + value);//자신의 인스턴스 멤버에 접근

                System.out.println("localVal = " + localVal);//자신이 속한 코드 블럭의 지역변수에도 접근 가능!!!
                System.out.println("paramVar(local) = " + paramVar);//매개변수도 지역변수이므로 당연히 접근 가능

                System.out.println("outInstanceVal = " + outInstanceVal);//바깥 클래스의 인스턴스 멤버에도 접근 가능
                //지역 클래스는 내부 클래스의 일종이다. 내부 클래스의 특징을 다 가짐. 즉 지역 클래스도 바깥 클래스 소속이다.
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
