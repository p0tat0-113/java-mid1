package exception.ex4;

import exception.ex4.exception.NetworkClientExceptionV4;
import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        while (true){
            System.out.print("전송할 문자: ");
            String text = scanner.nextLine();
            if(text.equals("exit")){
                break;
            }
            
            //Main 까지 올라온 해결할 수 없는 예외들은 모두 공통으로 처리한다.
            try {
                networkService.sendMessage(text);
            } catch (Exception e){
                 exceptionHandler(e);
            }
            System.out.println();
        }

        System.out.println("정상 종료");
    }

    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메세지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");

        System.out.println("==개발자용 디버깅 메세지==");
        e.printStackTrace(System.out); //스택 트레이스 출력, 디버깅에 도움됨
        //e.printStackTrace();//기본으로 System.err 로 출력함.
        //System.out 과 System.err 은 서로 다른 스트림으로 출력돼서 출력순서가 꼬여서 보일 수 있다.

        //필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx){//맞다 이렇게 하면 바로 다운캐스팅까지 해서 변수에 담아줌.
            System.out.println("[전송 오류] 전송 데이터: "+ sendEx.getSendData());
        }
    }
}
