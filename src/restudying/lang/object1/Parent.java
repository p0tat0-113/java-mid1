package restudying.lang.object1;

//Object 클래스는 자바의 모든 클래스의 최상위 부모이다.
//상속받을 부모 클래스를 명시적으로 지정하지 않으면 자동으로 Object 클래스를 상속받는다.
//모든 클래스들은 계속 부모로 타고 올라가다 보면 Object 클래스가 나온다.
public class Parent {
    void parentMethod(){
        System.out.println("parentMethod");
    }
}
