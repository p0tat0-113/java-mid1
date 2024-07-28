package restudying.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersMain11 {
    public static void main(String[] args) {
        //우선 with()으로 특정 단위를 바꾼 새로운 객체로 반환하는 것을 확인해보자.
        //Temporal 에서 제공하는 메서드이다.

        LocalDateTime now = LocalDateTime.now();

        now = now.with(ChronoField.DAY_OF_MONTH,25);
        System.out.println("now = " + now);

        //이것도 편의 메서드를 제공함.
        now = now.withYear(2077);
        System.out.println("now = " + now);

        //with()으로는 아주 단순하게만 날짜를 변경할 수가 있다.
        //다음주 금요일, 이번 달의 마지막 일요일 등등 이런 복잡한 날짜를 계산하고 싶으면 TemporalAdjusters를 사용하면 된다.
        now = LocalDateTime.now();
        System.out.println("오늘: "+now);

        now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)); //다음주나 혹은 이번주 가장 가까운 일요일인 날짜로 수정
        System.out.println("다음주나 혹은 이번주 가장 가까운 일요일인 날짜 = " + now);

        now = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); //이번 달 마지막 일요일
        System.out.println("이번 달 마지막 일요일: "+now);

        int dayOfWeek = now.with(TemporalAdjusters.lastDayOfYear()).get(ChronoField.DAY_OF_WEEK);
        System.out.println("올해의 마지막 날이 무슨 요일인지 = " + dayOfWeek);

        //TemporalAdjusters를 사용하면 이런 복잡한 계산들도 매우 쉽게 할 수 있다.
    }
}
