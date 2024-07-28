package restudying.time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각: " + localDateTime);

        LocalDateTime calculated = localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);//참조값을 반환하기 때문에 메서드 체이닝이 가능함.
        System.out.println("1년 2개월 3일 4시간 후의 시각 = " + calculated);
    }
}
