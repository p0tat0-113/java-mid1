package restudying.lang.string3;

public class StringOptimization5 {
    public static void main(String[] args) {
        //자바 컴파일러가 String을 다룰 때는 어느 정도 최적화를 한다.
        String str1 = "Hello" + " World";
        //이렇게 문자열 리터럴끼리 더하는 경우에는 아예 String str1 = "Hello World"로 만들어버림.

        String s1 = "Hello";
        String s2 = " World";
        String str2 = s1 + s2;
        //문자열 변수끼리 더하는 경우에는 안에 뭐가 들어가 있는지 알 수 없기 때문에 막 합칠 수는 없다.
        //대신 이렇게 만듦. String str2 = new StringBuilder().append(s1).append(s2).toString()

        //그런데 최적화가 어려운 경우가 있음.
        long startTime = System.currentTimeMillis();

        String strLoop = "";
        for (int i = 0; i < 100000; i++) {//문자열을 100000번 더함.
            strLoop += "Hello Java! ";
        }

        long endTime = System.currentTimeMillis();
        System.out.println("소요 시간: "+(endTime-startTime)+"ms");//10초 넘게 걸림

        /*
        이런 경우 최적화를 하긴 하는데, 문제가 최적화는 반복문 안에서만 이루어진다.
        아무리 최적화를 한다고 해도 결국 StringBuilder, String 객체를 100000번 생성하는 것은 똑같음.
        이럴 때는 가변 객체인 StringBuilder를 쓰면 성능을 극적으로 개선할 수 있다.
         */
    }
}
