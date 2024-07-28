package exception.basic.checked;

public class Service {
    Client client = new Client();

    //예외를 잡아서 처리하는 코드
    //try 에서 잡은 예외가 catch 의 대상에 없으면 예외를 잡을 수 없다. 이때는 예외를 throws로 밖으로 던져야한다.
    //catch는 예외를 지정하면 해당 예외와 그 하위 타입 예외를 모두 잡을 수 있다. 예외도 객체이기 때문에 다형성이 적용됨.
    //얘를 들어서 Exception이면 다 잡을 수 있음.
    public void callCatch(){
        try{
            client.call();//throw new MyCheckedException("ex"); 이 코드라고 생각하면됨.
        } catch (MyCheckedException e){//예외의 참조값이 e에 담긴다.
            //예외 처리 로직
            System.out.println("예외 처리, message: "+ e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    //체크 예외를 밖으로 던지는 코드, 안에서 해결이 안되면 밖으로 던져야함.
    //체크 예외는 잡지 않고 밖으로 던지려면 throws 예외와 같이 밖으로 던질 예외 메서드에 필수로 선언해야 한다.
    //체크 예외를 캐치하지도 않고, 던지지도 않으면 컴파일 오류가 발생한다.
    //참고로 체크예외를 던지는 경우에도 해당 타입과 자식 그 하위 타입을 모두 던질 수 있다. 근데 이럴 경우 이 예외를 받는 쪽도 Exception 타입으로 받게되니 주의
    public void catchThrow() throws MyCheckedException{
        client.call();
    }
}
