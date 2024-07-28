package restudying.lang.object1.poly1;

public class ObjectPoly1 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        poly(car);
        poly(dog);
    }

    static void poly(Object object){
        //object.move();
        //object.sound();
        if(object instanceof Car car){
            car.move();
        }
        if(object instanceof Dog dog){
            dog.sound();
        }
        /*
        여기서 Object를 활용한 다형성의 한계가 드러난다.
        코드를 보면 Object는 move sound 메서드를 가지고 있지 않아서 인스턴스 타입을 확인한 다음에 다운캐스팅을 해서 써야함.
        이러면 새로운 객체를 집어넣을 때마다 조건문을 추가해줘야 한다.
        다형성을 제대로 못써먹고 있음.

        그러면 이걸 제대로 써먹으려면 어떻게 해야할까?
         */
    }

    static private class Car{
        void move() {
            System.out.println("차 움직임");
        }
    }

    static private class Dog{
        void sound() {
            System.out.println("개 짖음");
        }
    }
}
