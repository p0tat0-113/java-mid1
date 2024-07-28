package restudying.lang.object1;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        //당연히 자신의 메서드와 상속받은 클래스의 메서드를 호출할 수 있음.

        System.out.println(child.toString());//근데 이건 누구의 메서드지?
        //바로 Object의 메서드이다.
        //Object 클래스는 이렇게 모든 객체들에게 필요한 공통 기능을 제공한다.
        System.out.println(child);//print()도 내부적으로 인수로 받은 객체의 toString()을 호출한다.

        /*
        Object 클래스의 의의

        1.모든 객체에 필요한 기본 기능 제공
        Object는 toString(), equals() 등 모든 객체들에게 필요한 다양한 기능을 제공한다.
        물론 이게 없어도 안될 것 없지만 그렇게 되면 프로그래머들이 다 각기 다르게 구현을 해서 써야하기 때문에 난장판이 될 것

        2.다형성의 기본 구현
        부모타입은 자식 타입을 담을 수 있다.
        Obejct는 모든 클래스의 부모이기 때문에 모든 자식 클래스들을 다 담을 수 있다.
        물론 이게 없어도 됨. 사용자가 따로 만들면 되거든.
        근데 그러면 또 프로그래머들이 다 각기 다르게 구현을 해서 써야하기 때문에 난장판이 될 것
         */
    }
}
