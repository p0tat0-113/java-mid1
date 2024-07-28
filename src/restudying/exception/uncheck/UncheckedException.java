package restudying.exception.uncheck;

//RuntimeException은 모든 언체크예외들의 부모이다.
//얘는 throws를 따로 선언하지 않아도, 개발자가 잡지 않으면 자동으로 다 밖으로 던져버림.
//이거 외에는 체크예외랑 똑같다.

class UncheckedException extends RuntimeException{
    public UncheckedException(String message) {
        super(message);//이 message 는 모든 예외들의 최상위 부모인 Throwable 의 생성자에 전달해서 저장할 수 있음.
        //.getMessage()메서드로 받아올 수 있다.
    }
}
