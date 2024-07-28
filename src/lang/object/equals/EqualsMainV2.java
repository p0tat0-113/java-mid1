package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity: "+(user1 == user2));//서로 다른 객체고 당연히 참조값도 다름. 동일하지 않음.
        System.out.println("equality: "+user1.equals(user2));//id를 기준으로 봤을 때 동등함.
    }
}
