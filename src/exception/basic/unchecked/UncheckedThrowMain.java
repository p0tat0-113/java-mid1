package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();//callThrow()에서 예외를 처리하지 않고 여기로 던짐.
        //여기서도 예외를 처리하지 않기 때문에 자동으로 main()밖으로 던짐. 정보와 스택트레이스를 출력하고 프로그램 종료.
        System.out.println("정상 종료");
    }
}
