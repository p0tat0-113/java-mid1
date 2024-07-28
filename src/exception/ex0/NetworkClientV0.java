package exception.ex0;
//외부 서버와 연결하고, 데이터를 전송하고, 연결을 종료하는 기능을 제공한다.
public class NetworkClientV0 {
    private final String address;//접속할 외부 서버 주소

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect(){
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
        //연결 실패 케이스는 나중에 만들 것
    }

    public String send(String data){
        //전송 성공
        System.out.println(address+" 서버에 데이터 전송: "+data);
        return "success";
        //전송 실패 케이스는 나중에 만들 것
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }
}
