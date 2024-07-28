package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

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
