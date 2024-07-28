package time.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        //LocalDateTime은 안에 LocalDate와 LocalTime을 가지고 있다.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("현재 날짜 시간: "+localDateTime);

        LocalDateTime ofDateTime = LocalDateTime.of(2002, 6, 2, 11, 55, 55);
        System.out.println("지정 날짜 시간: "+ofDateTime);
        
        //날짜와 시간 분리
        LocalDate localDate = ofDateTime.toLocalDate();
        LocalTime localTime = ofDateTime.toLocalTime();
        System.out.println("toLocalDate(): "+localDate);
        System.out.println("toLocalTime(): "+localTime);
        
        //날짜와 시간 합체
        localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("분리된 날짜 시간 합침: "+localDateTime);

        //계산(불변 주의)
        localDateTime = localDateTime.plusDays(5000);
        System.out.println("일자 더하기: "+localDateTime);
        localDateTime = localDateTime.plusYears(5000);
        System.out.println("년도 더하기: "+localDateTime);

        //비교
        LocalDateTime nowDT = LocalDateTime.now();
        LocalDateTime ofDT = LocalDateTime.of(2022,8,2,9,30,30);
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가?: "+ nowDT.isBefore(ofDT));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가?: "+ nowDT.isAfter(ofDT));
        System.out.println("현재 날짜 시간이 지정 날짜 시간과 같은가?: "+ nowDT.isEqual(ofDT));//그냥 equals()가 아닌 isEquals()
        //isEquals()는 타임존이 달라도 시간적으로 같으면 true를 반환한다. 예) UTC의 0시와 서울의 9시는 시간적으로 같음.
        //equals()는 객체의 타입, 타임존 등등 내부 데이터의 모든 구성요소가 같아야 true를 반환한다.
    }
}
