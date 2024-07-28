package restudying.eumeration.test.http;

public enum HttpStatus {
    //이 코드에서는 새로운 상태 상수가 생기더라도 변경할 부분이 상수 부분 밖에 없다!!!

    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        for (HttpStatus value : values()) {
            if(value.getCode() == httpCodeInput){
                return value;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
