package restudying.exception.ex.exceptions;

public class SendException extends NetworkException{
    private final String data;

    public SendException(String message, String data) {
        super(message);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
