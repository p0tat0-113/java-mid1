package restudying.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(2024, 1, 1);

        DayOfWeek fistDayOfMonth = date.getDayOfWeek();
        System.out.println("fistDayOfMonth: "+fistDayOfMonth);

        DayOfWeek lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("lastDayOfMonth: "+lastDayOfMonth);
    }
}
