package restudying.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class TemporalAccessors_get9 {
    public static void main(String[] args) {
        //TemporalAccessors 는 모든 날짜 객체들이 구현하는 인터페이스이다.
        //얘가 특정 필드를 조회할 수 있게 해주는 get(ChronoField field)메서드를 제공해서 어떤 날짜 객체이던지 다 이 메서드를 통해서 필드를 조회할 수 있게 설계됨.

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now.get(ChronoField.YEAR) = " + now.get(ChronoField.YEAR));
        System.out.println("now.get(ChronoField.MONTH_OF_YEAR) = " + now.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("now.get(ChronoField.DAY_OF_MONTH) = " + now.get(ChronoField.DAY_OF_MONTH));
        System.out.println("now.get(ChronoField.HOUR_OF_DAY) = " + now.get(ChronoField.HOUR_OF_DAY));
        System.out.println("now.get(ChronoField.MINUTE_OF_HOUR) = " + now.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("now.get(ChronoField.SECOND_OF_MINUTE) = " + now.get(ChronoField.SECOND_OF_MINUTE));
        //코드를 보면 지금이 올해 중 몇 번째 달인지, 이번 달 중에 며칠 째인지, 오늘 중 몇 시간 째인지 이런 것들을 알 수가 있다.
        System.out.println("now.get(ChronoField.DAY_OF_YEAR) = " + now.get(ChronoField.DAY_OF_YEAR));
        System.out.println("now.get(ChronoField.DAY_OF_WEEK) = " + now.get(ChronoField.DAY_OF_WEEK));//오늘이 이번 주 중에 몇 번 째 요일인지도 알 수 있다.

        //그런데 각 객체별로 자주 쓰는 기능은 편의 메서드들을 제공해줘서 매번 이렇게 길게 쓸 필요는 없다.
        System.out.println("now.getYear() = " + now.getYear());
        System.out.println("now.getMonth() = " + now.getMonth());

        //그리고 이 객체에 이 필드가 있는지 검사할 수 있음.
        System.out.println("now.isSupported(ChronoField.YEAR) = " + now.isSupported(ChronoField.YEAR));
    }
}
