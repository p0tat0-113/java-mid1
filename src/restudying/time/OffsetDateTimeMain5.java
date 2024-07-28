package restudying.time;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain5 {
    public static void main(String[] args) {
        //얘는 타임존(일광 절약 시간제에 대한 정보)는 없고 오프셋만 가지고 있다.
        //지역 시간대의 복잡성을 고려하지 않고 UTC와 얼마나 차이가 나는지만 고려함.

        OffsetDateTime now = OffsetDateTime.now();
        System.out.println(now);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(2077, 7, 7, 7, 7, 7, 7, ZoneOffset.of("+09:00"));
        System.out.println(offsetDateTime);

        //ZoneOffset 변경 가능
        System.out.println("한국시간: "+now);
        System.out.println("영국시간: "+now.withOffsetSameInstant(ZoneOffset.of("+00:00")));

        //OffsetDateTime 은 UTC와의 시간 차이만을 나타낼 때 사용하며, 지역 시간대의 복잡성을 고려하지 않는다.
        //시간대 변환 없이 로그를 기록하고, 데이터를 저장하고 처리할 때 적합하다.
    }
}
