package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//문제 설명
//2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.
//TestLoopPlus 클래스에 문제를 풀어라
//실행 결과 ```
//날짜 1: 2024-01-01
//날짜 2: 2024-01-15
//날짜 3: 2024-01-29
//날짜 4: 2024-02-12
//날짜 5: 2024-02-26
public class TestLoopPlus2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for (int i = 1; i < 6; i++){
            System.out.println("날짜 "+i+": "+localDate);
            localDate = localDate.plusWeeks(2);
        }

        System.out.println("----------------------------");

        //이렇게도 할 수 있음
        localDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate temp = localDate.plus(2*i, ChronoUnit.WEEKS);//원래 localDate 는 그대로 둠.
            System.out.println("날짜 "+(i+1)+": "+temp);
        }
    }
}
