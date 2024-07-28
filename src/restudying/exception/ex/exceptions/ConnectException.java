package restudying.exception.ex.exceptions;

public class ConnectException extends NetworkException{
    private final String address;

    public ConnectException(String message, String address) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
