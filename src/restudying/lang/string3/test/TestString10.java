package restudying.lang.string3.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성

        String[] arr = fruits.split(",");
        for (String string : arr) {
            System.out.println(string);
        }

        String joinedString = String.join("->",arr);//join 은 static 메서드
        System.out.println("joinedString = " + joinedString);
    }
}
