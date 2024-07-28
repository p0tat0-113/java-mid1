package restudying.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Period_DurationMain7 {
    public static void main(String[] args) {
        //Period Duration 은 기간을 나타낸다.
        Period period = Period.ofDays(1000);
        System.out.println("period = " + period);

        //계산에 사용
        LocalDate now = LocalDate.now();
        LocalDate future = now.plus(period);
        System.out.println(now);
        System.out.println(future);

        //날짜 차이 계산
        Period between = Period.between(now,future);
        System.out.println(between);
        System.out.println("between.getYears() = " + between.getYears());
        System.out.println("between.getMonths() = " + between.getMonths());
        System.out.println("between.getDays() = " + between.getDays());

        //기간을 일로만 구하고 싶으면 이렇게 ChronoUnit 사용
        System.out.println(ChronoUnit.DAYS.between(now,future));


        //Duration 은 시 분 초를 다룬 다는 것만 빼면 Period랑 쓰는 건 똑같음.
        Duration duration = Duration.ofMinutes(10);
        System.out.println(duration);

    }
}
