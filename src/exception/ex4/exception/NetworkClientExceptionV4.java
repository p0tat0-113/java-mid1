package exception.ex4.exception;

//NetworkClientExceptionV4 와 모든 자식 예외들은 전부 언체크예외가 된다.ㄴ

public class NetworkClientExceptionV4 extends RuntimeException{
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
