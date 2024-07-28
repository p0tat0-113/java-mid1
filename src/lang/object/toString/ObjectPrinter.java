package lang.object.toString;

public class ObjectPrinter {
    public static void print(Object obj){
        System.out.println("객체 정보 출력: "+ obj.toString());
        //Object 다형성 활용
        //obj.toString() 을 실행하면 obj에 담긴 인스턴스로 가서 거기에 있는 Object의 toString을 호출한다.
        //만약 자식이 오버라이딩 했다면 자식의 toString이 호출됨. 오버라이딩된 메서드는 항상 우선권을 가지기 때문이다.
    }
}
