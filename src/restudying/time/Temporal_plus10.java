package restudying.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Temporal_plus10 {
    public static void main(String[] args) {
        //모든 날짜 객체들은 Temporal 인터페이스를 구현한다. 그래서 Temporal 이 제공하는 get()메서드를 어떤 구현체이던지 다 일관성있게 사용할 수가 있다.

        LocalDate now = LocalDate.now();

        System.out.println("now.plus(10,ChronoUnit.YEARS) = " + now.plus(10, ChronoUnit.YEARS));

        //얘도 각 구현체에서 편의 메서드를 제공한다.
        System.out.println("now.plusYears(10) = " + now.plusYears(10));
    }
}
