package restudying.exception.check;

class Service {

    //여기에서는 잡아서 처리
    public void callCatch() {
        Client client = new Client();
        try {
            client.call();//예외 발생! catch 에서 잡을 수 있는지 확인!
        } catch(CheckedException e) {//자식 타입들까지 다 잡을 수 있음. 만약 잡지 못하는 예외라면 밖으로 던짐
            System.out.println("예외 잡음!");
            System.out.println(e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    //여기에서는 그냥 던짐ㅋㅋ
    public void callThrows() throws Exception {//자식 타입들까지 다 던질 수 있음.
        Client client = new Client();
        client.call();//잡지 않을꺼면 반드시 밖으로 던져야함.
    }
}
