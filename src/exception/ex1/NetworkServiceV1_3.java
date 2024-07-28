package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가

        String connectResult = client.connect();
        if(isError(connectResult)){//성공이 아니면(실패 했으면)
            System.out.println("[네트워크 오류 발생] 오류 코드: "+connectResult);
        } else {
            String sendResult = client.send(data);
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: "+sendResult);
            }
        }
        client.disconnect();
        //중간에 return 하지 않음. 중간에 어떤 예외가 발생하던지 무조건 disconnect()를 호출한다.
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
