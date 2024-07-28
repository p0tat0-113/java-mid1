package restudying.exception.poorEx1;

public class NetworkServiceV0 {
    public void sendMessage(String data){
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV0 client = new NetworkClientV0(address);

        client.initError(data);

        //일단 원시적인 방식으로 예외처리를 구현해봄. 메서드 호출 후 결과를 문자열로 받아서 connectError, sendError 인 경우 오류코드를 출력하고 바로 return 해서 빠져나감
        //그런데 지금 문제가 뭐냐면 데이터 전송을 실패했을 때 서버와의 연결을 끊지 않고 메서드를 빠져나감 버림. 외부자원을 제대로 반납하지 않으면 자원이 고갈돼서 뻗어버림.
        String connectError = client.connect();
        if(connectError.equals("connectError")){
            System.out.println("[네트워크 오류 발생] 오류코드: "+connectError);
            return;
        }

        String sendError = client.send(data);
        if(sendError.equals("sendError")){
            System.out.println("[네트워크 오류 발생] 오류코드: "+sendError);
            return;
        }

        client.disconnect();
    }
}
