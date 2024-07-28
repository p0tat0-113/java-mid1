package restudying.lang.wrapper4;

public class WrapperPerformance4 {
    public static void main(String[] args) {
        //숫자를 10억번 더하면서 기본형과 래퍼클래스의 성능 차이에 대해서 알아볼 것임. 기본형이 여전히 쓸모 있는 이유

        int iterations = 1_000_000_000;
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        long primitive = 0;
        for (int i = 0; i < iterations; i++) {
            primitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("소요시간: "+(endTime-startTime)+"ms");
        System.out.println(primitive);

        startTime = System.currentTimeMillis();
        Long wrapper = 0L;
        for (int i = 0; i < iterations; i++) {
            wrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("소요시간: "+(endTime-startTime)+"ms");
        System.out.println(wrapper);

        //기본형이 래퍼클래스보다 연산 성능이 더 빠름.
        //래퍼클래스의 인스턴스가 객체 메타데이터까지 포함해서 더 많은 메모리를 사용하기 때문이다.
        //그런데 10억번이나 연산을 했을 때 이정도 차이가 발생하는 것이지 대부분의 경우에는 거의 차이가 없다.
        //일반적인 애플리케이션에서는 이런 것을 최적화해봤자 사막의 모래알 하나 정도 차이라고 한다.
        //그래서 그냥 유지 보수 하기 좋은 쪽을 선택하면 된다고 함.


    }
}
