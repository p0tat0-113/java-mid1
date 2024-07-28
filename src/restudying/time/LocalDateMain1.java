package restudying.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateMain1 {
    public static void main(String[] args) {
        //타임 존 없이 현재 지역의 날짜를 다루는 객체 LocalDate

        //선언방법 - now() of()
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = LocalDate.of(2024, 6, 2);
        System.out.println(localDate);

        //계산 - 날짜 객체들은 모두 불변이기 때문에 조작 메서드는 반드시 반환값을 받아야 한다.

        //편의 메서드들
        localDate = localDate.withYear(1997);//불변에서 값을 변경하는 메서드들은 withXxx 인 경우가 많다고 했었음.
        localDate = localDate.plusDays(21);
        System.out.println(localDate);

        //원래는 Temporal 인터페이스의 기능을 이용해서 날짜 단위를 나타내는 열거형인 ChronoUnit 으로 조작한다.
        localDate = localDate.plus(5, ChronoUnit.YEARS);
        System.out.println(localDate);
    }
}
