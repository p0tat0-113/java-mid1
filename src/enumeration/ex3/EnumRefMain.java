package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(Grade.BASIC.getClass());
        System.out.println(Grade.GOLD.getClass());
        System.out.println(Grade.DIAMOND.getClass());

        System.out.println(Grade.BASIC);
        System.out.println(Grade.GOLD);
        System.out.println(Grade.DIAMOND);
        //enum클래스에서 toString()을 오버라이드 했기 때문에 참조값이 아닌 상수 이름이 출력됨.

        System.out.println(refValue(Grade.BASIC));
        System.out.println(refValue(Grade.GOLD));
        System.out.println(refValue(Grade.DIAMOND));

        //앞에서 직접 만든 타입 안전 열거형 패턴과 같이 셋은 다 같은 클래스 소속이면서 별개의 인스턴스를 가지고 있다.
    }

    private static String refValue(Object grade){//참조값을 출력해주는 메서드
        return Integer.toHexString(System.identityHashCode(grade));
        //참조값을 숫자로 반환하고, 다시 16진수로 변환
    }
}
