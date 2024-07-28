package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);//engine에 car인스턴스 자신을 넘겨줌.
    }

    //이 둘은 엔진에서만 사용하는 메서드
    //엔진에서만 사용하는 기능을 위해서 메서드를 추가해서, 모델 이름과 충전 레벨을 외부에 노출해야 함.
    public int getChargeLevel() {
        return chargeLevel;
    }

    public String getModel() {
        return model;
    }

    public void start(){
        engine.start();
        System.out.println(model+" 시작완료");
    }
}
