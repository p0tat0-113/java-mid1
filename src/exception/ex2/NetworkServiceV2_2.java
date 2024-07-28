package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가

        //이 코드에서는 예외를 막 던지지 않고, 잡아서 예외 흐름을 정상 흐름으로 복구해본다.
        //리턴을 사용해서 메서드를 정상적으로 빠져나감
        try{
            client.connect();
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 에러코드: "+e.getErrorCode() + ", 메세지: "+e.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 에러코드: "+e.getErrorCode() + ", 메세지: "+e.getMessage());
            return;
        }
        client.disconnect();
    };
    //try~catch 로 예외를 잡아서 예외가 복구되게 했지만 아직도 문제가 있다.
    //예외 처리를 했지만 정상 흐름과 예외 흐름이 섞여 있어서 코드를 읽기 어렵다.
    //사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제해야 한다.
}
