package exception.ex3.exception;

//연결 실패시 발생하는 예외. 내부에 연결을 시도한 주소를 가지고 있음.

public class ConnectExceptionV3 extends NetworkClientExceptionV3{
    private final String address;

    public ConnectExceptionV3(String address,String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
