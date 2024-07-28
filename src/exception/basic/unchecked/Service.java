package exception.basic.unchecked;
//unchecked 예외는 예외를 잡거나, 던지지 않아도 된다.
//예외가 발생하면 자동으로 밖으로 던진다.
public class Service {
    Client client = new Client();

    //필요한 경우 예외를 잡아서 처리할 수 있다.
    public void callCatch(){
        try {
            client.call();
        } catch (MyUncheckedException e){
            //예외 처리 로직
            System.out.println("예외 처리, message: "+e.getMessage());
        }
        System.out.println("정상 로직");
    }

    //예외를 잡지 않아도 된다. 자연스럽게 상위로 던져버림.
    //체크 예외랑 다르게 throws 선언을 명시적으로 하지 않아도 된다.
    //말그대로 이런 부분을 컴파일러가 체크하지 않기 때문에 언체크예외이다.
    public void callThrow () throws RuntimeException {
        client.call();
    }
}
