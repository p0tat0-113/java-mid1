package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가

        //이 코드에서는 하나의 try 블럭에 모든 정상코드를 담는다.
        //정상과 예외 흐름을 명확하게 분리할 수 있다.
        //예외가 발생하면 catch 로 가서 처리하고 정상적으로 종료됨.
        try{
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 에러코드: "+e.getErrorCode() + ", 메세지: "+e.getMessage());
        }

        //그런데 외부자원은 사용하기 난 뒤에 반드시 반납을 해야한다.
        //예외가 발생하더라도 반드시 disconnect()를 호출해서 외부자원을 반납하려면 어떻게 해야할까?
    };
}
