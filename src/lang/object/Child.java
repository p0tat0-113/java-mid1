package lang.object;

//상속할 클래스를 명시적으로 지정하면 Object클래스를 상속받지 않는다.
public class Child extends Parent{//명시적 상속
    public void childMethod(){
        System.out.println("childMethod");
    }
}
