package restudying.exception.ex;

import restudying.exception.ex.exceptions.ConnectException;
import restudying.exception.ex.exceptions.SendException;

public class NetworkClient implements AutoCloseable{
    private final String address;
    public boolean connectError;//자동으로 초기화되는 값은 false
    public boolean sendError;//이 필드들의 값이 true가 되면 연결,전송 실패

    public NetworkClient(String address) {
        this.address = address;
    }

    //이 메서드를 통해서 connectError , sendError 필드의 값을 true 로 설정할 수 있다.
    public void initError(String data){
        if(data.contains("error1")){//데이터에 error1이 포함되어 있으면
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }

    public void connect(){
        if(connectError) {
            throw new ConnectException(address+" 서버 연결 실패",address);
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){
        if(sendError) {
            throw new SendException(data+" 전송실패",data);
        }
        //전송 성공
        System.out.println(address+" 서버에 데이터 전송: "+data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    @Override
    public void close() {
        disconnect();
    }
}
