package restudying.lang.wrapper4;

public class WrapperMethods3 {
    public static void main(String[] args) {
        //래퍼 클래스의 기본 메서드들

        //문자열을 숫자 래퍼 객체로 바꾸는 방법
        Integer integer1 = Integer.valueOf("10");
        Integer integer2 = Integer.parseInt("20");
        System.out.println("integer1 = " + integer1);
        System.out.println("integer2 = " + integer2);

        //크기 비교
        System.out.println(integer1.compareTo(integer2));

        //산술연산
        System.out.println("Integer.sum(10,20) = " + Integer.sum(10, 20));
        System.out.println("Integer.max(10,20) = " + Integer.max(10, 20));
        System.out.println("Integer.min(10,20) = " + Integer.min(10, 20));

        //진법 변환
        System.out.println("Integer.toHexString(System.identityHashCode(integer1)) = " + Integer.toHexString(System.identityHashCode(integer1)));//참조값을 구하는 코드
        System.out.println("Integer.toBinaryString(10) = " + Integer.toBinaryString(10));
    }
}
