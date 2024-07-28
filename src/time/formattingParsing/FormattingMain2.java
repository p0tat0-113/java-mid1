package time.formattingParsing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포맷팅: 날짜와 시간을 문자로
        LocalDateTime localDateTime = LocalDateTime.of(2077, 7, 7, 9, 14, 30);
        System.out.println("localDateTime = " + localDateTime);//ISO 국제 표준대로 출력

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
        String format = localDateTime.format(formatter);
        System.out.println("format = " + format);

        //파싱: 문자를 다시 날짜와 시간으로
        LocalDateTime parse = LocalDateTime.parse(format, formatter);
        System.out.println("parse = " + parse);
    }
}
