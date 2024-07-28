package restudying.exception.poorEx2;

import restudying.exception.poorEx1.NetworkServiceV0;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NetworkServiceV1 networkService = new NetworkServiceV1();

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

