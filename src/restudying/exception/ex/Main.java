package restudying.exception.ex;

import restudying.exception.ex.exceptions.ConnectException;
import restudying.exception.ex.exceptions.SendException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NetworkService networkService = new NetworkService();

        while (true){
            System.out.print("전송할 문자: ");
            String text = scanner.nextLine();
            if(text.equals("exit")){
                break;
            }

            try {
                networkService.sendMessage(text);
            } catch (Exception e){//여기까지 올라온 해결 불가능한 예외들을 싹 다 잡아서 공통적으로 처리함.
                exceptionHandler(e);
            }

            System.out.println();
        }

        System.out.println("정상 종료");
    }

    static void exceptionHandler(Exception exception){
        System.out.println("[알 수 없는 오류 발생] 죄송합니다.. 흐규흐규...");

        System.out.println("==개발자 로그==");
        exception.printStackTrace(System.out);

        if (exception instanceof ConnectException){
            System.out.println("[연결 오류 발생] 주소: "+((ConnectException) exception).getAddress());
        }
        if (exception instanceof SendException){
            System.out.println("[전송 오류 발생] 데이터: "+((SendException) exception).getData());
        }
    }
}

