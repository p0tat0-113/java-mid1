package restudying.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain3 {
    public static void main(String[] args) {
        //LocalDateTime 은 LocalDate와 LocalTime을 합친 것임. 실제로 안에 까보면 둘이 들어가 있음.

        //생성
        System.out.println("생성");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = LocalDateTime.of(2002, 6, 2, 11, 30, 45);
        System.out.println(localDateTime);

        //날짜와 시간을 분리
        System.out.println("날짜와 시간을 분리");
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        //날짜와 시간을 합치기
        System.out.println("날짜와 시간을 합치기");
        localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);

        //계산도 당연히 할 수 있음
        System.out.println("조작");
        localDateTime = localDateTime.plusYears(5);
        localDateTime = localDateTime.plusDays(456);
        System.out.println(localDateTime);

        //비교
        System.out.println(localDateTime.isAfter(now));
        System.out.println(localDateTime.isBefore(now));
        System.out.println(localDateTime.isEqual(now));//equals()가 아니라 isEquals()를 써야함.
        //isEquals()는 타임존이 달라도 시간적으로 같으면 true를 반환함.

    }
}
