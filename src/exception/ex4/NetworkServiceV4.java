package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);//추가

        //해결할 수 있는 예외들은 잡지 않고 던져버림. (실제로는 몇 번 재시도 해볼 수 있다.)
        //해결할 수 없는 예외들은 생각하지 않는 것이 더 나은 선택일 수 있다.
        //해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다.
        //이런 방식 덕분에 해결할 수 없는 예외보다는 본인의 코드에 더 집중할 수 있다. 깔끔한 코드가 만들어짐.
        try{
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    };
}
