package restudying.lang.object1.poly1;

public class ToStringOverriding3 {
    public static void main(String[] args) {
        Car car1 = new Car("Model 3");
        Car car2 = new Car("Model S");
        Car car3 = new Car("Model Y");

        Object[] carArr = {car1,car2,car3};//모든 타입의 객체를 다 담을 수 있는 배열

        for (Object o : carArr) {
            objPrinter(o);
            //이렇게 하면 메모리 상에서 Object로 먼저 가서 toString()메서드를 찾아봄
            //근데 그 밑에 자식 클래스에서 오버라이딩한 toString()이 있기 때문에 자식의 오버라이딩된 toString()이 호출된다.
            //아무튼 이 코드는 다형성을 제대로 활요했기 때문에 새로운 타입의 객체가 들어와도 손 댈 부분이 없다.
        }
    }

    //이 메서드는 실제 println()의 구조와 흡사함.
    private static void objPrinter(Object o){//다형적 참조
        String s = o.toString();//메서드 오버라이딩
        System.out.println(s);
        //이 메서드는 구체적인 개별 클래스가 아니라 추상적인 Object 에 의존하고 있다.
        //때문에 어떤 타입이 오던지 이 메서드는 수정할 부분이 없다.

    }

    static class Car{
        private final String name;

        public Car(String name) {
            this.name = name;
        }

        //toString() 오버라이딩.
        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
