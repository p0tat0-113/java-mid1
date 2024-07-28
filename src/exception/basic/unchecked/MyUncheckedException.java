package exception.basic.unchecked;

//RuntimeException을 상속받은 예외는 언체크 예외가 된다.
//언체크 예외는 체크 예외와 기본적으로 동일하다. 차이가 있다면 예외를 던지는 throws 를 선언하지 않고, 생략할 수 있다

public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);//예외 메세지를 저장, Throwable의 detailMessage애 보관된다.
    }
}
