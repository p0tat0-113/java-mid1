package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
        //throws를 명시하지 않아도 컴파일 에러가 발생하지 않음.
        //예외가 발생하면 자동으로 밖으로 던진다.
    }
}
