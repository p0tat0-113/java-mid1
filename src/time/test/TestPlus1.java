package time.test;

import java.time.LocalDateTime;

//문제 설명
//2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라.
//TestPlus 클래스에 문제를 풀어라.
//실행 결과 ```
//기준 시각: 2024-01-01T00:00
//1년 2개월 3일 4시간 후의 시각: 2025-03-04T04:00
public class TestPlus1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime plusDt = localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        //localDateTime은 불변형으로, 값을 변경하는 메서드들은 새로운 객체의 참조값을 반환하기 때문에 이런 메서드 체이닝이 가능함.

        System.out.println("기준 시각 = " + localDateTime);
        System.out.println("1년 2개월 3일 4시간 후의 시각 = " + plusDt);
    }
}
