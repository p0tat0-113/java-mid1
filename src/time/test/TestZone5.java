package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//문제5 - 국제 회의 시간
//서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구해라.
//실행 결과를 참고하자.
//TestZone 클래스에 문제를 풀어라.
//서울의 회의 시간: 2024-01-01T09:00+09:00[Asia/Seoul]
//런던의 회의 시간: 2024-01-01T00:00Z[Europe/London]
//뉴욕의 회의 시간: 2023-12-31T19:00-05:00[America/New_York]
public class TestZone5 {
    public static void main(String[] args) {

        ZonedDateTime seoul = ZonedDateTime.of(2024,1,1,9,0,0,0,ZoneId.of("Asia/Seoul"));
        System.out.println("seoul = " + seoul);

        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("london = " + london);

        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("newYork = " + newYork);

        //withZoneSameInstant(ZoneId)로 시간대를 바꿀 수 있다. 바뀐 시간대에 맞춰서 시간도 바뀜.
    }
}
