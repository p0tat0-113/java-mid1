package restudying.exception.uncheck;

//Client에서 예외를 발생시켜서 밖으로 던져버릴 거임.

class Client {
    public void call() { //언체크 예외라서 throws를 선언하지 않아도 컴파일에러가 발생하지 않음.
        throw new UncheckedException("언체크 예외");//체크 예외를 던지려면 반드시 throws 를 명시적으로 선언을 해줘야함!
    }
}
