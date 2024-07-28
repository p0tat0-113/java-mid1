package nested.inner.ex2;

import nested.inner.ex1.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Model 3", 99);
        car.start();
    }
}
