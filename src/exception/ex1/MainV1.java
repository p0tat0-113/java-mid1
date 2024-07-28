package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

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
    //이 코드에서는 오류 상황을 시뮬레이션 한다.
    //입력에 error1, error2가 섞여있으면 연결오류, 전송오류가 발생한다.

    //그런데 아직 연결에 실패했는데도 데이터 전송을 해버리는 문제가 있다.
    //그리고 오류가 발생했을 때 어떤 오류인지 자세히 내역을 남기면 이후 디버깅에 도움이 될 것이다.

    //NetworkServiceV1_2까지 리팩토링한 결과 이제 NetworkClientV1의 반환값에 따라 예외처리를 해서 오류 발생시 바로 메서드에서 빠져나가게 함.
    //덕분에 연결에 실패했을 때 데이터 전송을 시도하는 일은 없어짐.
    //그런데 아직도 데이터 전송을 실패했을 때, 서버와의 연결을 끊지 않고 그대로 빠져나가 버리는 문제가 있다.
    //외부자원은 사용이 끝나면 반드시 연결을 해제해서 반납해야함. - 문서 내용 참고하기
    //예외가 발생하던, 발생하지 않던 무조건 연결을 해제하게끔 개선해야 한다.

    //NetworkServiceV1_3까지 리팩토링 connectError, sendError가 발생해도 무조건 disconnect()를 호출함.
}
