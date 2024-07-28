package restudying.lang.wrapper4;

/*
기본형은 객체가 아니기 때문에 다음과 같은 한계가 있다.
1. 객체가 아님:
객체가 아니기 때문에 객체지향프로그래밍의 장점을 살릴 수가 없다. 예를 들어 객체는 유용한 메서드를 제공할 수 있지만 기본형은 메서드를 가지지 못함.
추가로 객체 참조가 필요한 컬렉션 프레임워크를 사용할 수 없다. 제네릭도 사용할 수 없다고는 하는데 이건 아직 안배워서 몰루.
2. null 값을 가질 수가 없음:
때로는 null 값을 가져야할 때도 있는데 기본형은 null 값을 가지지 못한다.
 */

public class MyInteger1Main {
    public static void main(String[] args) {
        MyInteger1 myInteger1 = new MyInteger1(10);
        System.out.println(myInteger1);

        System.out.println(myInteger1.compareTo(5));
        System.out.println(myInteger1.compareTo(10));
        System.out.println(myInteger1.compareTo(20));

        //기본형은 이런 기능을 가지지 못하기 때문에 항상 외부의 메서드를 가져다 써야한다.
    }
}
