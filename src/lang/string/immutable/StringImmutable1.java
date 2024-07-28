package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" world");//반환값을 따로 받지 않으면 아무 일도 일어나지 않음.
        //String은 불변객체다. 따라서 변경과 관련된 메서드들은 새로운 객체를 만들어서 반환함.
        System.out.println(str);
    }
}
