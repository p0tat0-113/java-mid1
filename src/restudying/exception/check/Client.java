package restudying.exception.check;

//Client에서 예외를 발생시켜서 밖으로 던져버릴 거임.

class Client {
    public void call() throws CheckedException {
        throw new CheckedException("체크 예외");//체크 예외를 던지려면 반드시 throws 를 명시적으로 선언을 해줘야함!
    }
}
