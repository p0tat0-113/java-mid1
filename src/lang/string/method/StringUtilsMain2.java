package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello Java!";

        //format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s",num,bool,str);
        System.out.println(format1);

        String foramt2 = String.format("숫자: %.2f",10.1234);
        System.out.println(foramt2);

        //printf format이 기본으로 들어가 있음.
        System.out.printf("숫자: %.2f\n", 10.1234);

        //matches 메서드
        String regex = "Hello, (java!|World)";//Java 혹은 World
        System.out.println(str.matches(regex));//문자열이 정규 표현식 패턴과 일치하는지 확인
    }
}
