package restudying.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneID_ZonedDateTimeMain4 {
    public static void main(String[] args) {
        //타임존 안에는 UTC 로부터의 시간차이인 오프셋에 대한 정보와 일광 절약 시간제에 대한 정보를 모두 포함하고 있다.
        //자바는 타임존을 ZonedId 객체로 제공을 한다.

        //사용 가능한 모든 ZonedId를 출력
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }

        //생성
        System.out.println("==ZonedId 객체 생성==");

        ZoneId systemDefault = ZoneId.systemDefault();//시스템에서 사용중인 타임존을 가져옴
        System.out.println(systemDefault);

        ZoneId zoneId = ZoneId.of("Asia/Seoul");//문자열로 얻을 수도 있음. 오타나면 예외 발생
        System.out.println(zoneId);


        //ZonedDateTime은 LocalDateTime에 ZonedId와 ZoneOffset이 합쳐진 것이다.
        //ZonedDateTime은 시간대를 고려한 날짜와 시간을 표현할 때 사용한다.

        //생성
        System.out.println("==ZonedDateTime 생성==");

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //LocalDateTime과 ZonedId를 합쳐서 생성도 가능
        LocalDateTime localDateTime = LocalDateTime.of(2022, 6, 2, 11, 45, 30);
        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        ZonedDateTime combination = ZonedDateTime.of(localDateTime, zoneId1);
        System.out.println(combination);

        //of()로 생성할 때는 타임존도 같이 넣어줘야 함.
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2077, 7, 7, 7, 7, 7, 0, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);

        //타임존을 바꿀 수도 있음. 타임존에 맞춰서 시간을 변경하는 것도 가능하다. 즉 지금 영국은 몇 시인지 알 수 있다는 것.
        System.out.println("==타임존 변경==");
        System.out.println("한국시간: "+now);
        System.out.println("영국시간: "+now.withZoneSameInstant(ZoneId.of("UTC")));
    }
}
