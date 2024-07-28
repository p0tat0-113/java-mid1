package time.temporalUnitField;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        //날짜와 시간을 조작
        //날짜와 시간을 조작하려면 어떤 시간 단위(Unit)를 변경할 지 선택해야 한다. 이때 ChronoUnit이 사용됨.
        //Temporal plus(long amountToAdd, TemporalUnit unit)로 원하는 단위로 더할 수 있음.
        //조회는 TemporalAccessor, 조작은 Temporal

        LocalDateTime dt = LocalDateTime.of(2030, 8, 23, 13, 30, 59);
        System.out.println("dt = " + dt);

        //10년 더하기
        LocalDateTime plus1 = dt.plus(10, ChronoUnit.YEARS);//ChronoUnit 사용
        System.out.println("plus1 = " + plus1);

        //여기서도 자주 사용하는 기능은 편의메서드를 제공
        LocalDateTime plus2 = dt.plusYears(10);//편의 메서드 사용
        System.out.println("plus2 = " + plus2);

        Period period = Period.of(10,0,0);
        LocalDateTime plus3 = dt.plus(period);//Period(기간)를 만들어서 더하기
        System.out.println("plus3 = " + plus3);
    }
}
