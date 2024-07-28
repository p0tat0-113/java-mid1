package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate thisMohth = LocalDate.of(year, month, 1);
        LocalDate nextMonthFirst = thisMohth.with(TemporalAdjusters.firstDayOfNextMonth());

        //1일이 무슨 요일인지 알아야 함. 요일은 월~일까지 1~7의 값으로 받아올 수 있음.
        int firstDayOfMonth = thisMohth.getDayOfWeek().getValue() % 7; //일~월 0~7이 되게 바꿈.

        System.out.println("Su Mo Tu We Th Fr Sa");

        //공백 부분 출력
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("   ");
        }

        //숫자를 하나 출력할 때마다 LocalDate 객체인 thisMohth에 1일씩 더함. nextMonthFirst(다음달 1일인 객체)보다 이전일 때 까지만 반복함.
        while (thisMohth.isBefore(nextMonthFirst)) {
            System.out.printf("%2d ", thisMohth.getDayOfMonth());
            if (thisMohth.getDayOfWeek() == DayOfWeek.SATURDAY) {//토요일, 즉 끝에 닿았으면 개행 문자를 출력함.
                System.out.println();
            }
            thisMohth = thisMohth.plusDays(1);
        }
    }
}