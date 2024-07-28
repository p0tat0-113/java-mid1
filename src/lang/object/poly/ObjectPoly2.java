package lang.object.poly;

public class ObjectPoly2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();//Object도 인스턴스를 생성할 수 있음.

        Object[] objects = {dog,car,object};//Object타입 배열. 모든 객체를 다 담을 수 있다.

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수: "+objects.length);
    }
}
