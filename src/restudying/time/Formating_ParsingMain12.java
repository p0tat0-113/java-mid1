package restudying.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formating_ParsingMain12 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("ISO 표준 포맷 = " + now);

        //포맷팅 - 날짜 객체를 내가 원하는 포맷의 문자열로 변경
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");//이 패턴에 대한 정보는 문서를 찾아보자.
        String s = now.format(formatter);
        System.out.println("포맷팅 완료! = " + s);

        //파싱 - 특정 포맷의 문자열로부터 날짜 객체를 뽑아내는 것
        LocalDate parsed = LocalDate.parse(s, formatter);
        System.out.println("파싱 완료! = " + parsed);
    }
}
