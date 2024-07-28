package time.temporalUnitField;

import java.time.temporal.ChronoUnit;
import  java.time.LocalTime;

public class ChronoUnitMain {
    public static void main(String[] args) {
        //ChronoUnit은 TemporalUnit을 구현하는 열거형으로 다양한 시간 단위를 제공한다.

        ChronoUnit[] values = ChronoUnit.values();//values() 열거형의 상수들을 배열로 반환
        for (ChronoUnit value : values) {
            System.out.println(value);//ChronoUnit도 toString을 오버라이딩 해놓았음.
        }

        //각 단위의 길이를 구할 수 있음
        //ChronoUnit.HOURS.soutv 이렇게 치면 자동으로 아래 포맷으로 만들어줌.
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());

        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        //차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long between1 = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println(between1);

        long between2 = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println(between2);
    }
}
