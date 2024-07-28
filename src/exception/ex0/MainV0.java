package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NetworkServiceV0 networkService = new NetworkServiceV0();

        while (true){
            System.out.print("전송할 문자: ");
            String text = scanner.nextLine();
            if(text.equals("exit")){
                break;
            }
            networkService.sendMessage(text);
            System.out.println();
        }

        System.out.println("정상 종료");
    }
}
