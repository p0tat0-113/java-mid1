package time.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();
        System.out.println(now);//Instant이기 때문에 UTC 기준 시간이 나온다.

        //from: 다른 타입의 날짜와 시간을 기준으로 Instant 를 생성
        System.out.println("from 다른 타입의 날짜와 시간을 기준으로 Instant 를 생성");

        ZonedDateTime zDt = ZonedDateTime.now();
        Instant from = Instant.from(zDt);//ZonedDateTime에는 타임존이 있기 때문에 이걸 이용해서 UTC로 변환할 수 있다.
        System.out.println(from);

        zDt = ZonedDateTime.of(1970,1,1,0,0,0,0,ZoneId.of("UTC"));
        from = Instant.from(zDt);
        System.out.println(zDt);

        System.out.println("ofEpochSecond() 에포크 시간을 기준으로 Instant를 생성");
        Instant ofEpochSecond = Instant.ofEpochSecond(0);
        System.out.println(ofEpochSecond);//1970년 1월 1일 0시 0분 0초로부터 0초를 더한 시간

        //계산 초, 밀리초, 나노초를 더하는 정도의 간단한 메서드만 제공
        System.out.println("plusSeconds()");
        ofEpochSecond = ofEpochSecond.plusSeconds(3600);
        System.out.println(ofEpochSecond);

        //조회
        //getEpochSecond() 1970년 1월 1일 0시 0분 0초로부터 몇초가 지났는지 반환
        System.out.println("getEpochSecond() 1970년 1월 1일 0시 0분 0초로부터 몇초가 지났는지 반환");
        System.out.println(ofEpochSecond.getEpochSecond());
        System.out.println(now.getEpochSecond());//1970년 1월 1일 0시 0분 0초로부터 현재까지 흐른 초
    }
}
