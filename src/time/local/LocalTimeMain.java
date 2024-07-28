package time.local;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("현재 시간: "+localTime);

        LocalTime ofTime = LocalTime.of(9, 14, 0);
        System.out.println("지정 시간: "+ofTime);

        //계산(불변 주)
        ofTime = ofTime.plusSeconds(100);
        System.out.println("100초 더함: "+ofTime);
    }
}
