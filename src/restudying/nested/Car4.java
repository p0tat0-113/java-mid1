package restudying.nested;

public class Car4 {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car4(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model+"시작완료");
    }

    private class Engine{
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);//바깥 인스턴스의 인스턴스 멤버에 바로 접근할 수 있기 때문에 불필요한 public을 줄일 수 있음.
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
