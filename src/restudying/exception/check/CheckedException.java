package restudying.exception.check;

//Exception은 모든 체크예외들의 부모이다. Exception을 상속받으면 체크예외가 됨.
//체크 예외는 예외 발생시, 반드시 사용자가 명시적으로 잡아서 처리하던지, throws 로 던지던지 둘 중 하나를 선택해야 한다.
//그렇지 않으면 컴파일 에러 발생

class CheckedException extends Exception{
    public CheckedException(String message) {
        super(message);//이 message 는 모든 예외들의 최상위 부모인 Throwable 의 생성자에 전달해서 저장할 수 있음.
        //.getMessage()메서드로 받아올 수 있다.
    }
}
