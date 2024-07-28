package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        //에러 코드와 왜 에러 코드가 발생했는지 개발자에세 알려주는 message, 이렇게 2가지를 받음.
        //message는 Throwable 에서 제공하는 기본 기능을 사용. 이런 오류 메세지를 잘 적어두는게 중요하다고 함.
    }

    public String getErrorCode(){
        return errorCode;
    }
}
