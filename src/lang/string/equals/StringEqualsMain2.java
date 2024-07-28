package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        //리터럴로 선언한건 ==으로, new로 선언한건 equals를 그때그때 쓰면 되는가 아닌가 싶을 수 있지만
        //만약 아래와 같이 별도의 메서드로 분리되어 있다면 메서드 입장에서는 어떤 방법으로 선언한게 들어온건지 알 수 없기 때문에
        //항상 equals()로 비교하는게 옳다.
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(isSame(str1,str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(isSame(str3,str4));
    }

    private static boolean isSame(String x, String y){
        return x == y;
    }
}
