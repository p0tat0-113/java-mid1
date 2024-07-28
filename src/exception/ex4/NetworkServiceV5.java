package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //try 문이 끝나면 resource 의 close()가 자동으로 즉시 호출된다. catch 보다도 먼저 호출됨.
        //자원을 최대한 빨리 반납한다.
        //기존에는 try catch finally로 catch 이후에 자원을 반납했다.
        //catch 없이 try 만 있어도 됨.
        try (NetworkClientV5 client = new NetworkClientV5(address);){
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e){//예외를 확인해서 출력해보고 밖으로 던짐. catch 진입 타이밍을 보기 위한 코드
            System.out.println("[예외 확인] "+e.getMessage());
            throw e;
        }
    };
}
