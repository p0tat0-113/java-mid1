package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data){
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가

        String connectResult = client.connect();
        //결과가 성공이 아니다 -> 오류다. 그냥 바로 오류다 라는게 이해하기 쉬움
        if(isError(connectResult)){//성공이 아니면(실패 했으면)
            System.out.println("[네트워크 오류 발생] 오류 코드: "+connectResult);
            return;//오류가 발생한 경우 바로 리턴해서 빠져나감
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+sendResult);
            return;
        }

        client.disconnect();
    }

    //원래는 if(!connectResult.equals("success")){} 였는데 ctrl + alt + m 을 누르니까 자동으로 이런 isError 메서드를 만들어줌
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
