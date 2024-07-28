package enumeration.test.http;

public enum HttpStatus {
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

    //code를 숫자로 받고, 그 숫자에 맞는 상수(즉 알맞게 초기화된 객체)를 넘겨줘야 함. static 메서드여야 함. 이상한 숫자가 들어오면 null을 반환해야함.
    public static HttpStatus findByCode(int httpCodeInput) {
//        return switch (httpCodeInput){
//            case 200 -> OK;
//            case 400 -> BAD_REQUEST;
//            case 404 -> NOT_FOUND;
//            case 500 -> INTERNAL_SERVER_ERROR;
//            default -> null;
//        }; //이것보다는 아래 코드가 코드 변경을 최소화할 수 있음.

        for (HttpStatus value : values()) {//java.lang.Enum 을 상속받았기 때문에 values()를 그냥 쓸 수가 있다. 모든 상수들을 배열에 담아서 반환.
            if(value.getCode() == httpCodeInput) {
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

    //HTTP 상태 코드는 200 ~ 299사이의 숫자를 성공으로 인정한다.
    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
