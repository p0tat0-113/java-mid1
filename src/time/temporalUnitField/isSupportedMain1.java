package time.temporalUnitField;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class isSupportedMain1 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        //System.out.println("now.get(ChronoField.MINUTE_OF_HOUR) = " + now.get(ChronoField.MINUTE_OF_HOUR));
        //LocalDate는 시,분,초 속성을 가지고 있지 않기 때문에 이런 것들은 조회가 불가능하다. 시도시 예외 발생

        //이런 문제를 예방하기 위해 TemporalAccessor 와 Temporal 인터페이스는
        //현재 타입에서 특정 시간 단위나 필드를 사용할 수 있는지 확인할 수 있는 메서드를 제공
        boolean supported =  now.isSupported(ChronoField.MINUTE_OF_HOUR);
        if(supported){
            System.out.println("now.get(ChronoField.MINUTE_OF_HOUR) = " + now.get(ChronoField.MINUTE_OF_HOUR));
        }else {
            System.out.println("불가");
        }
    }
}
