package nested.anonymous.ex;

public interface Process {
    //오버라이딩 된 메서드가 실행되게 해야 하기 때문에, 실수로 오버라이딩하지 않을 경우를 예방하기 위해 인터페이스 사용
    void run();
}
