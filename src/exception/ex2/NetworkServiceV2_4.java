package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가

        try{
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 에러코드: "+e.getErrorCode() + ", 메세지: "+e.getMessage());
        }

        client.disconnect();//이렇게 하면 예외 처리가 끝난 후 정상흐름으로 돌아오면서 이게 실행됨

        //하지만 지금과 같은 방식에는 여전히 큰 문제가 있다. 바로 catch 에서 잡을 수 없는 예외가 발생할 때이다.
        //catch 에서 잡지 못하므로 예외를 즉시 자동으로 밖으로 던져버린다.
        //따라서 disconnect()가 호출되지 않는 문제가 발생한다.

        //사용 후에 반드시 disconnect()를 호출해서 연결해제를 보장하는 것은 매우 어렵다.
        //정상적인 상황, 예외상황 그리고 어디선가 모르는 예외를 밖으로 던지는 상황까지 모든 것을 고려해야 한다.
    };
}
