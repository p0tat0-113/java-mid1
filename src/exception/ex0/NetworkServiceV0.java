package exception.ex0;
//NetworkClient 를 사용해서 데이터를 전송한다. NetworkClient 를 사용하려면
//연결, 전송, 연결 종료와 같은 복잡한 흐름을 제어해야 하는데, 이런 부분을 NetworkService 가 담당한다
public class NetworkServiceV0 {

    public void sendMessage(String data){
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
