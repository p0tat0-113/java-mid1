package lang.string.test;

//문제 설명
//str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
//indexOf() 를 반복문과 함께 풀면 된다

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성

        int count = 0;
        int startIndex = 0;

        while(true){
            int result = str.indexOf(key,startIndex);

            if(result == -1){//indexOf로 찾지 못하면 -1을 반환함.
                break;
            }

            count++;
            startIndex = result+key.length();
        }

        System.out.println(count);
    }
}
