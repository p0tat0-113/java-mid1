package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

//문제4 - 시작 요일, 마지막 요일 구하기
//입력 받은 월의 첫날 요일과 마지막날 요일을 구해라.

public class TestAdjusters4 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        // 코드 작성

        LocalDate localDate = LocalDate.of(year, month, 15);
        System.out.println("firstDay = " + localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());
        System.out.println("lastDay = " + localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());

        //localDate.with(TemporalAdjusters.firstDayOfMonth())로 localDate의 날짜를 그 달의 첫날로 바꿈
        //그리고 getDayOfWeek로 그날의 요일을 가져옴.
    }
}
