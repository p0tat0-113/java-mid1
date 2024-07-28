package restudying.exception.poorEx2;

import restudying.exception.poorEx1.NetworkClientV0;

public class NetworkServiceV1 {
    public void sendMessage(String data){
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV0 client = new NetworkClientV0(address);

        client.initError(data);

        //이제 어떠한 경우에라도 disconnect()가 호출이 되긴 함.
        //근데 정상흐름과 예외흐름이 완전 섞여버려서 코드가 너무 복잡하다.
        String connectError = client.connect();
        if(connectError.equals("connectError")){
            System.out.println("[네트워크 오류 발생] 오류코드: "+connectError);
        } else{
            String sendError = client.send(data);
            if(sendError.equals("sendError")){
                System.out.println("[네트워크 오류 발생] 오류코드: "+sendError);
            }
        }

        client.disconnect();
    }
}
