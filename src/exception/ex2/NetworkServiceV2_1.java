package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가

        //이 코드에서는 일단 예외를 잡아서 처리하지 않고, 밖으로 던져버림.
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
