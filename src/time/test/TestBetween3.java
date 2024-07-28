package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//문제 설명
//시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라. 실행 결과를 참고하자.
//남은 기간: x년 x개월 x일 형식으로 출력한다.
//디데이: x일 남은 형식으로 출력한다.
//실행 결과 ```
//시작 날짜: 2024-01-01
//목표 날짜: 2024-11-21
//남은 기간: 0년 10개월 20일
//디데이: 325일 남음
public class TestBetween3 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        long dDay = ChronoUnit.DAYS.between(startDate, endDate);

        Period period = Period.between(startDate,endDate);

        System.out.println("시작 날짜: "+startDate);
        System.out.println("목표 날짜: "+endDate);

        //포맷팅 해서 뽑아냄
        System.out.println("남은 기간: "+period.getYears()+"년 "+period.getMonths()+"개월 "+period.getDays()+"일");
        System.out.println("디데이: "+ dDay+"일 남음");

        //이 문제 푸는게 고생 좀 했다....
        //처음에는 D-DAY를 구하는데 Period를 썼었음. 근데 얘는 무조건 년,월,일 형식을 갖추고 있어서 일자만 뽑아낼 수가 없었음.
        //그래서 ChronoUnit.DAYS.between(startDate, endDate); 이렇게 얻어냈다.
        //남은 기간을 출력하는 부분은 처음에 DateTimeFormatter로 출력해볼려고 했는데 DateTimeFormatter가 0년은 무조건 1년으로 바꿔서
        //출력해버리는데 문제가 있어서 여러모로 테스트해보다가 결국 안돼서 지금같은 코드로 바꿈.
    }
}
