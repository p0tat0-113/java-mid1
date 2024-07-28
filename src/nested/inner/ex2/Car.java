package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();//내부 클래스의 인스턴스를 생성할 때는 외부 클래스의 이름을 생략할 수 있다.
        //바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때 내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인스턴스를 자동으로 참조
    }

    public void start(){
        engine.start();
        System.out.println(model+" 시작완료");
    }

    //Engine을 내부 클래스로 가져옴.
    //더 이상 Car 인스턴스의 참조값을 따로 받아서 메서드를 통해 접근할 필요가 없다.
    private class Engine {
        public void start(){
            System.out.println("충전 레벨 확인: "+chargeLevel);//바깥 클래스의 인스턴스 멤버에 접근 가능
            System.out.println(model + " 의 엔진을 구동합니다.");
        }
    }
}
