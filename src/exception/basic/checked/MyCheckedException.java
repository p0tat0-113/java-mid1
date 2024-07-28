package exception.basic.checked;

//예외 클래스를 만들려면 예외를 상속 받으면 된다.
//Exception을 상속받은 예외는 체크 예외가 된다.

public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);//예외 메세지를 저장, Throwable의 detailMessage애 보관된다.
    }
}
