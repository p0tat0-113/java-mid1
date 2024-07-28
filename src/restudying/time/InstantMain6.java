package restudying.time;

import java.time.*;

public class InstantMain6 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant from = Instant.from(ZonedDateTime.now());
        System.out.println(from);

        Instant instant = Instant.ofEpochSecond(100);
        System.out.println(instant);

        instant = instant.plusSeconds(100);
        System.out.println(instant);

        System.out.println(instant.getEpochSecond());

        //Instant 를 ZonedDateTime 으로 변경
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);

        //Instant 를 OffsetDateTime 으로 변경
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.of("+09:00"));
        System.out.println(offsetDateTime);
    }
}
