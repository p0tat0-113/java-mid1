package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);//추가

        try{
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+e.getAddress()+", 메세지: "+e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 데이터: "+e.getSendData()+", 메세지: "+e.getMessage());
        } finally {
            client.disconnect();
        }
        //예외를 각각의 예외상황에 맞춰서 만들면 각 필요에 맞게 예외를 잡아서 처리할 수 있다.
        //e.getAddress() , e.getSendData() 와 같이 각각의 예외 클래스가 가지는 고유의 기능을 활용할 수 있다.
        //실행 결과를 보면 ConnectExceptionV3 , SendExceptionV3 이 발생한 각각의 경우에 출력된 오류 메시지가 다른 것을 확인할 수 있다.
    };
}
