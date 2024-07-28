package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year,month);
    }

    private static void printCalendar(int year,int month){
        LocalDate localDate = LocalDate.of(year, month, 1);

        //1일이 무슨 요일인지 알아야 함. 요일은 월~일까지 1~7의 값으로 받아올 수 있음.
        //말일이 며칠인지 알아야 함(그 달이 총 며칠인지).
        int FirstDayOfMonth = localDate.getDayOfWeek().getValue();
        if (FirstDayOfMonth == 7){
            FirstDayOfMonth = 0;
        }
        int lastDateOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();

        printFirstLine(FirstDayOfMonth);
        printLastLines(FirstDayOfMonth,lastDateOfMonth);
    }

    private static void printFirstLine(int FirstDayOfMonth){
        System.out.println("Su Mo Tu We Th Fr Sa");

        //공백 부분 출력
        for (int i = 0; i < FirstDayOfMonth; i++) {
            System.out.print("   ");
        }

        for (int i = 0; i < (7-FirstDayOfMonth); i++) {
            System.out.printf("%2d ",(i+1));
        }
        System.out.println();

    }

    private static void printLastLines(int FirstDayOfMonth, int lastDateOfMonth){
        int count = 0;
        for(int i = 7-FirstDayOfMonth+1; i < lastDateOfMonth+1; i++){
            System.out.printf("%2d ",(i));
            count += 1;
            if (count == 7){//한 주를 다 출력하고 나면 개행문자 출력
                count = 0;
                System.out.println();
            }
        }
    }
}
