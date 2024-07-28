package lang.string.test;

//문제 설명
//split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
//실행 결과를 참고해라.

//실행 결과
//apple
//banana
//mango
//joinedString = apple->banana->mango

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성

        String[] fruitsArr = fruits.split(",");

        for (String string : fruitsArr) {
            System.out.println(string);
        }

        System.out.println("joinedString = "+String.join("->",fruitsArr));//join은 이렇게 써야한다.
    }
}
