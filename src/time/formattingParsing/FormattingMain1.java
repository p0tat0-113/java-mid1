package time.formattingParsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 6, 5);
        System.out.println("localDate = " + localDate);//ISO 표준 방식으로 출력됨

        //포맷팅: 날짜를 문자로
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 dd일");
        System.out.println("format = " + localDate.format(formatter));

        //파싱: 문자를 날짜로
        String input = "2077년 07월 07일";
        LocalDate parse = LocalDate.parse(input, formatter);
        System.out.println("parse = " + parse);
    }
}
