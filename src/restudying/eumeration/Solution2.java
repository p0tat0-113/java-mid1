package restudying.eumeration;

public class Solution2 {
    //타입 안전 열거형 패턴
    //미리 나열한 것들 외에는 사용할 수 없다.
    //Solution2 타입으로 입력받는 곳에는 여기에 열겨된 상수들 외에는 아무것도 쓸 수가 없다.

    public static final Solution2 BRONZE = new Solution2();//이렇게 상수에 저장된 미리 생성된 인스턴스들만 쓸 수 있게 해야함.
    public static final Solution2 SILVER = new Solution2();//얘네는 프로그램상에서 딱 한 번만 생성되는 static 으로 하고, final 로 변경을 못하게 해야지만 값을 안전하게 비교할 수 있음.
    public static final Solution2 GOLD = new Solution2();

    private Solution2() {//함부로 인스턴스를 생성해서 입력값으로 집어넣지 못하게 해야함.
    }
}
