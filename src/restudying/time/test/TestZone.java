package restudying.time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.of(2024, 1, 1, 9, 0,0,0,ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("seoul = " + seoul);
        System.out.println("london = " + london);
        System.out.println("newYork = " + newYork);
    }
}
