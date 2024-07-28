package restudying.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeMain2 {
    public static void main(String[] args) {
        //앞에서 본 LocalDate 랑 비슷한데 얘는 날짜가 아니라 시간을 다룸

        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime localTime = LocalTime.of(19, 20, 45);
        System.out.println(localTime);

        //조작
        localTime = localTime.plusMinutes(25);
        System.out.println(localTime);

        localTime = localTime.plus(2, ChronoUnit.HOURS);
        System.out.println(localTime);
    }
}
