package exception.ex4;

//외부 서버와 연결하고, 데이터를 전송하고, 연결을 종료하는 기능을 제공한다.

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    private final String address;//접속할 외부 서버 주소
    public boolean connectError;//자동으로 초기화되는 값은 false
    public boolean sendError;//이 필드들의 값이 true가 되면 연결,전송 실패

    public NetworkClientV4(String address) {
        this.address = address;
    }

    //언체크 예외이기 때문에 throws 선언 필요X
    public void connect()  {
        if(connectError) {
            throw new ConnectExceptionV4(address,address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if(sendError) {
            throw new SendExceptionV4(data,address + " 서버에 데이터 전송 실패");
            //throw new RuntimeException("ex");
        }
        //전송 성공
        System.out.println(address+" 서버에 데이터 전송: "+data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    //이 메서드를 통해서 connectError , sendError 필드의 값을 true 로 설정할 수 있다.
    public void initError(String data){
        if(data.contains("error1")){//네트워크 서비스에서 보내주는 데이터에 error1이 포함되어 있으면
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
}
