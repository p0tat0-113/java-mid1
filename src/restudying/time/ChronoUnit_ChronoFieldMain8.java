package restudying.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ChronoUnit_ChronoFieldMain8 {
    public static void main(String[] args) {
        //ChronoUnit은 시간의 단위를 나타내고 기간을 구하는 등의 메서드를 제공한다. 얘는 조작을 하는데 사용함. TemporalUnit 인터페이스를 구현함.
        //ChronoField는 단순 단위가 아닌 필드를 나타낸다. 얘는 조회를 하는데 사용함. TemporalField 인터페이스를 구현함.
        //그리고 이 둘은 열거형이다!

        //ChronoUnit
        for (ChronoUnit value : ChronoUnit.values()) {
            System.out.println(value+" | "+ value.getDuration());
        }

        LocalDate now = LocalDate.now();
        LocalDate future = LocalDate.of(2077, 7, 7);
        //다양한 단위로 기간을 구할 수 있음.
        System.out.println(ChronoUnit.DAYS.between(now,future));
        System.out.println(ChronoUnit.YEARS.between(now,future));

        //이렇게 특정 단위를 가지고 있는지 검사할 때도 써먹을 수 있다.
        if(!now.isSupported(ChronoUnit.HOURS)){
            System.out.println("LocalDate는 시간 단위를 가지고 있지 않음.");
        }


        //ChronoField, 얘는 단순 단위가 아님
        for (ChronoField value : ChronoField.values()) {
            System.out.println(value + " | " + value.range());
        }

        //ChronoUnit과 ChronoField는 단독으로 사용하기 보다는 TemporalAccessors, Temporal이 제공하는 조회, 조작 메서드들과 함께 사용한다.
    }
}
