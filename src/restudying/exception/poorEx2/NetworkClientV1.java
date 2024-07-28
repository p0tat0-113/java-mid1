package restudying.exception.poorEx2;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;//자동으로 초기화되는 값은 false
    public boolean sendError;//이 필드들의 값이 true가 되면 연결,전송 실패

    public NetworkClientV1(String address) {
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

    public String connect(){
        if(connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data){
        if(sendError) {
            System.out.println(address+" 서버에 데이터 전송 실패: "+data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address+" 서버에 데이터 전송: "+data);
        return "success";
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }
}
