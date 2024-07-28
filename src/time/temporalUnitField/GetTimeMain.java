package time.temporalUnitField;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        //시간 조회
        //TemporalAccessor 인터페이스의 기능 get(TemporalField field) 이용
        //TemporalAccessor 는 특정 시점의 시간을 조회하는 기능을 제공

        LocalDateTime dt = LocalDateTime.of(2030, 8, 23, 13, 30, 59);
        System.out.println("dt = " + dt);

        System.out.println("YEAR: "+dt.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR: "+dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH: "+dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: "+dt.get(ChronoField.DAY_OF_YEAR));//지금이 1년 중 며칠째인지
        System.out.println("HOUR_OF_DAY: "+dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR: "+dt.get(ChronoField.MINUTE_OF_HOUR));

        //편의 메서드 제공
        //get(TemporalField field) 을 사용하면 코드가 길어지고 번거롭기 때문에
        //자주 사용하는 조회 필드는 간단한 편의 메서드를 제공
        System.out.println("편의 메서드 제공");
        System.out.println("YEAR: "+dt.getYear());
        System.out.println("MONTH_OF_YEAR: "+dt.getMonthValue());
        System.out.println("DAY_OF_MONTH: "+dt.getDayOfMonth());
        System.out.println("DAY_OF_YEAR: "+dt.getDayOfYear());//지금이 1년 중 며칠째인지
        System.out.println("HOUR_OF_DAY: "+dt.getHour());
        System.out.println("MINUTE_OF_HOUR: "+dt.getMinute());

        System.out.println("편의 메서드 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));//지금이 하루 중 몇 분 째인지
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));//지금이 하루 중 몇 초 째인지
    }
}
