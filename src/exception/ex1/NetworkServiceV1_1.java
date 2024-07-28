package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data){
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
