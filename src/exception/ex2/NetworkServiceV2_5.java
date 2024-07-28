package exception.ex2;

public class NetworkServiceV2_5 {

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
        } finally {
            client.disconnect();
            //catch 에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출된다.
            //catch 에서 처리할 수 없는 예외가 와도, 예외가 밖으로 던져지는 것은 finally 코드 블럭이 끝나고 나서이다.
            //참고로 catch 없이 try~finally 만 쓸 수도 있다고 한다.
        }



    };
}
