package time.zoned;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        //얘는 LocalDateTime에 ZoneOffset만 합쳐진 것이다.
        //타임존("Asia/Seoul") 즉 ZoneId가 없기 때문에 일광 절약 시간제같은 정보는 얻지 못함.

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("now Odt: "+offsetDateTime);

        //LocalDateTime을 OffsetDateTime으로 변환
        LocalDateTime lDt = LocalDateTime.of(2022, 8, 2, 9, 30, 30);
        System.out.println("lDt: "+lDt);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(lDt, ZoneOffset.of("+01:00"));
        System.out.println("Odt: "+offsetDateTime1);

        //얘도 ZoneOffset을 변경할 수 있음. ZoneOffset에 맞춰서 시간도 바뀜.
        OffsetDateTime koreaODt = OffsetDateTime.now();
        System.out.println("한국 시간: "+koreaODt);

        OffsetDateTime engODt = koreaODt.withOffsetSameInstant(ZoneOffset.of("+00:00"));
        System.out.println("영국 시간: "+engODt);
    }
}
