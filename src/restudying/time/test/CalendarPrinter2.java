package restudying.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CalendarPrinter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        printCalendar(year,month);
    }

    private static void printCalendar(int year, int month){
        LocalDate thisMonthDate = LocalDate.of(year, month,1);
        LocalDate nextMonthDate = thisMonthDate.with(TemporalAdjusters.firstDayOfNextMonth());
        int firstDayOfMonth = thisMonthDate.getDayOfWeek().getValue()%7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("   ");
        }
        while(thisMonthDate.isBefore(nextMonthDate)){
            System.out.printf("%2d ",thisMonthDate.getDayOfMonth());
            if (thisMonthDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                System.out.println();
            }
            thisMonthDate = thisMonthDate.plusDays(1);
        }
    }
}
