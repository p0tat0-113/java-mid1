package exception.ex2;

//외부 서버와 연결하고, 데이터를 전송하고, 연결을 종료하는 기능을 제공한다.

public class NetworkClientV2 {
    private final String address;//접속할 외부 서버 주소
    public boolean connectError;//자동으로 초기화되는 값은 false
    public boolean sendError;//이 필드들의 값이 true가 되면 연결,전송 실패

    //오류 상황을 시뮬레이션 하기 위해 사용자의 입력 값을 활용한다.
    //연결 실패: 사용자가 입력하는 문자에 "error1" 단어가 있으면 연결에 실패한다. 오류 코드는 "connectError" 이다.
    //전송 실패: 사용자가 입력하는 문자에 "error2" 단어가 있으면 데이터 전송에 실패한다. 오류 코드는 "sendError" 이다.

    public NetworkClientV2(String address) {
        this.address = address;
    }

    //이전처럼 success,오류코드를 문자열로 반환하는 것이 아니라 문제 발생 시 예외를 발생시켜서 밖으로 던진다. 예외에 오류코드와 설명을 담아둔다.
    //성공시에는 메서드 정상 종료
    public void connect() throws NetworkClientExceptionV2 {//체크예외이고, 예외를 잡지 않기 때문에 throws를 반드시 적어줘야 함.
        if(connectError) {
            throw new NetworkClientExceptionV2("connectError",address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError) {
            //throw new NetworkClientExceptionV2("sendError",address + " 서버에 데이터 전송 실패");
            //중간에 다른 예외가 발생했다고 가정
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
