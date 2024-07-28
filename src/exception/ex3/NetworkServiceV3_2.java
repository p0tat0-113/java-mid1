package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //네트워크 클라이언트 객체를 생성하고, 연결,전송,해제 같은 복잡한 흐름을 제어한다.
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);//추가

        //중요한 예외만 따로 catch 로 잡아서 처리
        //그 외의 잡다한 예외들은 부모타입인 NetworkClientExceptionV3 로 잡아서 뭉뚱그려서 처리
        //그 외 Exception 의 자식 예외들도 다 뭉뚱그려서 처리

        try{
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {//중요한 예외는 따로 잡아서 메세지를 명확하게 남김
            System.out.println("[연결 오류] 주소: "+e.getAddress()+", 메세지: "+e.getMessage());
        } catch (NetworkClientExceptionV3 e) {//그 외의 오류는 뭉뚱그려서 메세지 출력
            System.out.println("[네트워크 오류] 메세지: "+e.getMessage());
        } catch(Exception e) {
            System.out.println("[알 수 없는 오류] 메세지: "+e.getMessage());
        } finally {
            client.disconnect();
        }

    };
}
