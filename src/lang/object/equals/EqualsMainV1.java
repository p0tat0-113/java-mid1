package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("identy: "+ (userV1 == userV2));//서로 다른 인스턴스 이므로 당연히 참조값이 다름. false
        System.out.println("equality: "+ (userV1.equals(userV2)));//동등성도 false가 나옴
        //그 이유는 Object가 기본으로 제공하는 equals()를 까보면 나온다.
        //기본 제공 equals()는 내부적으로 ==으로 참조값을 비교하고 있음.
        //동등성이라는 개념은 클래스마다 다를 수 있다!!
        //어떤 클래스는 주민등록번호, 어떤 클래스는 전화번호를 기반으로 동등성을 비교할 수 있다.
        //따라서 동등성 비교를 하고 싶으면 equals()를 오버라이딩 해야한다.
    }
}
