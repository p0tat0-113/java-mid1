package restudying.nested;

public class Network2 {
    public void sendMessage(String text){
        NetworkMessage2 networkMessage2 = new NetworkMessage2(text);//중첩 클래스의 인스턴스를 생성
        networkMessage2.send();
    }

    //NetworkMessage2 는 Network2 에서만 쓰이는 상황임.
    //패키지에 드러나있으면 쓰는 사람 입장에서 헷갈린다.
    //그러니까 그냥 중첩시켜서 '논리적 그룹화'를 했음.
    static private class NetworkMessage2{//NetworkMessage2 는 Network2 에서만 쓰이는 상황임.
        private String message;

        public NetworkMessage2(String message) {
            this.message = message;
        }

        public void send(){
            System.out.println(message + " - 전송완료");
        }
    }

    public static void main(String[] args) {
        Network2 network2 = new Network2();
        network2.sendMessage("Hello World");
    }
}
