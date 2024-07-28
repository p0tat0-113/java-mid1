package exception.ex3;

//외부 서버와 연결하고, 데이터를 전송하고, 연결을 종료하는 기능을 제공한다.

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;//접속할 외부 서버 주소
    public boolean connectError;//자동으로 초기화되는 값은 false
    public boolean sendError;//이 필드들의 값이 true가 되면 연결,전송 실패

    public NetworkClientV3(String address) {
        this.address = address;
    }

    //이전에는 NetworkClientException 하나로 다 퉁치고 error code 만을 가지고 분류했지만
    //이제는 각 상황별로 서로 다른 예외를 발생시킨다.
    //오류 코드로 어떤 문제가 발생했는지 이해하는 것이 아니라 예외 그 자체로 어떤 오류가 발생했는지 알 수 있다.

    public void connect() throws ConnectExceptionV3 {//체크예외이고, 예외를 잡지 않기 때문에 throws를 반드시 적어줘야 함.
        if(connectError) {
            throw new ConnectExceptionV3(address,address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if(sendError) {
            //throw new SendExceptionV3(data,address + " 서버에 데이터 전송 실패");
            throw new RuntimeException("ex");
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
