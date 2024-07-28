package lang.object;

//부모가 없으면 묵시적으로 모든 클래스의 최상위 클래스인 Object클래스를 묵시적으로 상속받는다.
public class Parent extends Object{//묵시적으로 상속받기 때문에 extends Object지워도 된다.
    public void parentMethod(){
        System.out.println("parentMethod");
    }
}
