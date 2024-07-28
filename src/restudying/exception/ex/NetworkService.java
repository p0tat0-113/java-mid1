package restudying.exception.ex;

public class NetworkService {
    public void sendMessage(String data){
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.

        //try-with-resources 를 사용. 예외가 발생하면 자동으로 NetworkClient 에 있는 close()가 호출돼서 외부자원부터 해제를 한 다음에 예외를 밖으로 던짐.
        try(NetworkClient networkClient = new NetworkClient(address)){
            networkClient.initError(data);
            networkClient.connect();
            networkClient.send(data);
            //client()하고 send()가 발생시키는 예외는 런타임 예외라서 자동으로 던져짐. 얘네는 어차피 해결할 수 없는 예외라서 그냥 Main 에서 한 번에 공통으로 처리한다.
        }
    }
}
