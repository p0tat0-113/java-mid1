package time.periodDuration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(10);
        System.out.println("duration: "+duration);

        LocalTime localTime = LocalTime.of(1, 0, 0);
        System.out.println("localTime: "+localTime);

        //계산에 사용
        LocalTime plus = localTime.plus(duration);
        System.out.println("더한 시간: "+plus);

        //시간 차이
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 0);

        Duration between = Duration.between(startTime, endTime);

        System.out.println("between: "+between);
        System.out.println("차이: "+between.getSeconds()+"초");
        System.out.println("일한 시간: "+between.toHours()+"시간 "+between.toMinutesPart()+"분 ");//toMinutesPart()는 시간 빼고 남은 분 표시
    }
}
