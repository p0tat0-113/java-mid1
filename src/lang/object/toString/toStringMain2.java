package lang.object.toString;

public class toStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model 3");
        Dog dog1 = new Dog("멍멍이",2);//Dog은 toString을 오버라이딩함.
        Dog dog2 = new Dog("멍멍이2", 1);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용으로 toString 호출");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //참고 - 객체의 참조값을 직접 출력하는 방법
        //Dog은 toString은 오버라이딩 해버려서 참조값을 직접 볼 수 없게 되었다.
        //이럴 때 아래 코드를 치면 볼 수 있음.
        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refValue1);
        //System.identityHashCode()로 참조값을 10진수 정수 형태로 얻고, Integer.toHexString()으로 보기 편하게 16진수로 바꾸는 것이다.
    }
}
