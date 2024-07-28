package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        //ClassGrade에 대해 더 잘 이해하기 위해 작성한 코드

        System.out.println(ClassGrade.BASIC.getClass());
        System.out.println(ClassGrade.GOLD.getClass());
        System.out.println(ClassGrade.DIAMOND.getClass());
        //각각의 상수는 모두 ClassGrade 타입을 기반으로 인스턴스를 만들었기 때문에 모두 ClassGrade 타입이다.

        System.out.println(ClassGrade.BASIC);
        System.out.println(ClassGrade.GOLD);
        System.out.println(ClassGrade.DIAMOND);
        //하지만 셋은 모두 개별적으로 인스턴스를 생성하기 때문에 참조값은 다 다르다.

        //static 이므로 애플리케이션 로딩 시점에 3개의 ClassGrade인스턴스가 생성되고, 각각의 상수는 같은 ClassGrade타입의 서로 다른 인스턴스를 참조함.

        ClassGrade a = ClassGrade.BASIC;
        ClassGrade b = ClassGrade.BASIC;
        System.out.println(a==b);
        //반복적으로 호출해도 항상 같은 인스턴스를 참조한다.
        //static final로 선언된 상수는 클래스가 처음 로드될 때 초기화됩니다.
        //따라서 ClassGrade.BASIC을 처음 호출할 때 메서드 영역에 BASIC 인스턴스가 생성되고,
        //이후에는 그 인스턴스를 재사용하게 됩니다. 이를 통해 메모리 사용을 효율적으로 할 수 있습니다.
    }
}
