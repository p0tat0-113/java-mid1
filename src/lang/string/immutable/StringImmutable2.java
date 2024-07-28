package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" world");//반환값을 따로 받지 않으면 아무 일도 일어나지 않음.

        System.out.println(str1);
        System.out.println(str2);
    }
}
