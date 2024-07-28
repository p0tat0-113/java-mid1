package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        Scanner scanner = new Scanner(System.in);
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        while (true){
            System.out.print("전송할 문자: ");
            String text = scanner.nextLine();
            if(text.equals("exit")){
                break;
            }
            networkService.sendMessage(text);//이 코드에서는 일단 예외를 처리하지 않고 다 던짐
            System.out.println();
        }

        System.out.println("정상 종료");
    }
}
