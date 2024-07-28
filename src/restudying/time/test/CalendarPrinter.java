package restudying.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        calendar(year,month);
    }

    static void calendar(int year, int month){
        LocalDate localDate = LocalDate.of(year, month, 1);
        int firstDayOfWeek = localDate.get(ChronoField.DAY_OF_WEEK)%7;//일~월 0~6

        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        LocalDate firstDayOfNextMonth = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        while(localDate.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ",localDate.getDayOfMonth());
            if(localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                System.out.println();
            }
            localDate = localDate.plusDays(1);
        }
    }
}
