package lang.object.poly;

public class ObjectPoly {
    //Object 다형성과 한계
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);//action메서드의 매개변수 obj는 최상위 클래스인 Object타입이기 때문에 모든 타입을 다 담을 수 있다.
        action(car);
    }

    private static void action(Object obj){
        //obj.move() //당연히 컴파일 에러 발생. obj는 Object타입이기 때문에 Object에서 찾는데 Object에는 move(), sound()메서드가 없다.
        //obj.sound()

        //이럴 때는 객체에 맞게 다운캐스팅을 하면 된다.
        if(obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
