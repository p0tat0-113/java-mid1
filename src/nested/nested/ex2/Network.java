package nested.nested.ex2;

public class Network {
    public void sendMessage(String text){
        //내 클래스에 포함된 중첩클래스에 접근할 때는 앞에 내 클래스 이름을 붙이지 않아도 된다.
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {//private으로 외부 접근을 막음. static은 접근 제어자가 아니다..
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println(content);
        }
    }
    //중첩 클래스는 사용 목적부터가 바깥 클래스 안에서만 사용하는 것이다.
    //만약 중첩 클래스를 밖에서 호출해서 사용하고 있다면, 이미 중첩 클래스의 목적에 맞지 않을 수 있다.
    //영한 아저씨 피셜 가끔은 밖에서 호출해서 사용할 때도 있긴 한데 대부분은 이런 경우 그냥 따로 빼는게 낫다고 함.
}
