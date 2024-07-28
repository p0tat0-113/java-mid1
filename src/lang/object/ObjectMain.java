package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드이다.
        String string = child.toString();//toString 메서드는 객체에 대한 정보를 제공해주는 메서드이다. 나중에 자세히 설명해준다고 함.
        System.out.println(string);
    }
}
