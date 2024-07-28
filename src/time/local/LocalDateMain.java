package time.local;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("오늘의 날짜: "+localDate);

        LocalDate ofDate = LocalDate.of(2022, 8, 2);
        System.out.println("지정 날짜: "+ofDate);

        //계산(불변임에 주의)
        ofDate = ofDate.plusDays(10);//불변에서 뭔가를 변경하는 메서드는 반드시 반환값을 받아야 함.
        System.out.println("10일 더하기: "+ofDate);
    }
}
