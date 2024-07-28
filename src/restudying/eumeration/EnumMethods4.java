package restudying.eumeration;

import java.util.Arrays;

public class EnumMethods4 {
    public static void main(String[] args) {
        //모든 enum 들은 java.lang.Enum 을 자동으로 상속받기 때문에 얘가 제공하는 메서드들을 다 쓸 수 있다.

        //values() 해당 enum 클래스가 가지고 있는 상수들을 배열에 담아서 반환함.
        Grade3[] values = Grade3.values();
        System.out.println(Arrays.toString(values));//[BRONZE, SILVER, GOLD]

        //name() ordinal()
        for (Grade3 value : values) {
            System.out.println(value.name() + " | " + value.ordinal());
            //ordinal() 선언된 순서를 반환함.
        }

        //문자열 -> Enum 동적으로 변환
        String s = "BRONZE";
        Grade3 grade3 = Grade3.valueOf(s);
        System.out.println(grade3);//주어진 이름과 일치하는 ENUM 상수를 반환
    }
}
