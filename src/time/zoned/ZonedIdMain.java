package time.zoned;

import java.time.ZoneId;


public class ZonedIdMain {
    public static void main(String[] args) {
        //자바는 타임존으로 ZoneId형태로 제공한다.
        //ZoneId를 통해 일광 절약 시간제와 오프셋에 대해서 알 수 있음.

        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }

        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {//ZoneId.getAvailableZoneIds() 이용 가능한 타임존을 모두 불러옴.
            ZoneId zoneId = ZoneId.of(availableZoneId);
            //ZoneId.of("타임존 이름")으로 ZoneId객체를 얻을 수 있다. 현재 availableZoneId에는 "Asia/Seoul"이런 문자열이 들어가 있음.
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        //ZoneId객체를 얻는데에는 이렇게 2가지 방법이 있음. systemDefault() 와 of()
        ZoneId zoneId = ZoneId.systemDefault();//시스템이 사용하는 기본 ZoneId 를 반환한다.
        System.out.println("ZoneId.systemDefault(): "+zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println("ZoneId.of('Asia/Seoul'): "+zoneId1);
    }
}
