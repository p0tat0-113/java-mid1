package lang.wrapper.test;
//문제 설명
//배열에 입력된 모든 숫자의 합을 구하자. 숫자는 double 형이 입력될 수 있다.
public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        // 코드 작성

        double sum = 0.0d;
        for (String string : array) {
            sum+=Double.parseDouble(string);
        }
        System.out.println("sum = "+sum);
    }
}
