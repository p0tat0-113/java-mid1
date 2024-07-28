package time.zoned;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        //ZonedDateTime은 LocalDateTime과 ZoneId, ZoneOffset이 합쳐진 것이다.
        //ZoneId는 일광 절약 시간제와 오프셋에 관한 정보를 포함하고 있음.
        //계산의 편의성을 위헤 ZoneOffset도 따로 가지고 있다고 한다.

        ZonedDateTime nowZdt = ZonedDateTime.now();//현재 날짜 시간, 여기서의 ZoneId는 System default
        System.out.println("nowZdt: "+ nowZdt);

        //ZonedDateTime.of() LocalDateTime과 ZoneId를 합쳐서 ZonedDateTime으로 만들 수 있음.
        LocalDateTime lDt = LocalDateTime.of(2022, 8, 2, 9, 30, 30);
        ZonedDateTime zDt1 = ZonedDateTime.of(lDt, ZoneId.of("Asia/Seoul"));
        System.out.println("zDt1: "+zDt1);

        //이렇게도 생성할 수 있다.
        ZonedDateTime zDt2 = ZonedDateTime.of(2022, 8, 2, 9, 30, 30,0,ZoneId.of("Asia/Seoul"));
        System.out.println("zDt2: "+zDt2);

        //타임존을 바꿀 수 있음. 타임존에 맟줘서 시간도 함께 변경된다. 지금 영국은 몇 시일까?
        ZonedDateTime koreaDt = ZonedDateTime.now();
        System.out.println("한국 시간: "+koreaDt);

        ZonedDateTime englishDt = koreaDt.withZoneSameInstant(ZoneId.of("UTC"));//withZoneSameInstant()
        System.out.println("영국 시간: "+englishDt);
    }
}
