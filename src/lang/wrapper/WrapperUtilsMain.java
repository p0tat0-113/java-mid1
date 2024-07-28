package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);//숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10");//문자열을 넣는 것도 가능. 문자열, 래퍼 객체로 변환
        int intValue = Integer.parseInt("10");//문자열 전용, 기본형으로 변환
        //래퍼객체로 반환하고 싶으면 valueOf(), 기본형으로 반환하고 싶으면 parseInt()를 쓰면 된다.
        int intValue2 = Integer.valueOf("10");//이렇게 valueOf를 써서 래퍼클래스로 바꾼 다음에 오토 언박싱 되게 해도 됨.
        //각 타입에 맞게 parseXxx()메서드들이 있음.

        //비교
        System.out.println(i1.compareTo(5));//오른쪽 숫자보다 크면 1
        System.out.println(i1.compareTo(10));//같으면 0
        System.out.println(i1.compareTo(20));//작으면 -1

        //산술 연산
        //합, 최소, 최대
        System.out.println("sum: "+Integer.sum(10,20));
        System.out.println("min: "+Integer.min(10,20));
        System.out.println("max: "+Integer.max(10,20));
    }
}
