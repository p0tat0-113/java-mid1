package exception.ex3.exception;

//전송 실패시 발생하는 예외. 내부에 전송을 시도한 데이터를 가지고 있음.

public class SendExceptionV3 extends NetworkClientExceptionV3{
    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}