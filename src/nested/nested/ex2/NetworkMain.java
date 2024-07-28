package nested.nested.ex2;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("Hello World");
    }

    //이제는 패키지를 열었을 때 Network하나만 보인다. 사용하는 입장에서 헷갈리지 않음.
    //Network를 열어보면 중첩 클래스인 NetworkMessage는 private인 것을 보고 Network만 쓰면 된다는걸 알 수 있음.
}
