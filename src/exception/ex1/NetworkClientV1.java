package exception.ex1;
//외부 서버와 연결하고, 데이터를 전송하고, 연결을 종료하는 기능을 제공한다.
public class NetworkClientV1 {
    private final String address;//접속할 외부 서버 주소
    public boolean connectError;//자동으로 초기화되는 값은 false
    public boolean sendError;//이 필드들의 값이 true가 되면 연결,전송 실패

    //오류 상황을 시뮬레이션 하기 위해 사용자의 입력 값을 활용한다.
    //연결 실패: 사용자가 입력하는 문자에 "error1" 단어가 있으면 연결에 실패한다. 오류 코드는 "connectError" 이다.
    //전송 실패: 사용자가 입력하는 문자에 "error2" 단어가 있으면 데이터 전송에 실패한다. 오류 코드는 "sendError" 이다.

    public NetworkClientV1(String address) {
        this.address = address;
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
