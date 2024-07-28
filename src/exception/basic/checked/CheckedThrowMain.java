package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {//예외가 main 밖으로 던져짐
        Service service = new Service();
        service.catchThrow();//여기서 alt+enter 를 누르면 자동으로 thorws 를 추가해줌
        //예외가 발생, 코드를 더 이상 진행하지 않고 여기서 throws 해버림.
        System.out.println("정상종료");
    }
    //예외가 main 밖으로 던져지면 예외 정보와 스택 트레이스(Stack Trace)를 출력하고 프로그램이 종료된다.
    //예외가 어디에서 터졌고, 어떤 경로를 따라서 타고 왔는지 알 수 있다.
}
