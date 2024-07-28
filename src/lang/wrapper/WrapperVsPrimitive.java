package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;//자바에서 숫자에 이렇게 구분자를 넣을 수 있음.
        long startTime, endTime;

        //먼저 기본형 long 사용, 약 270ms 소요
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i<iterations; i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println("primitive: "+(endTime-startTime)+"ms");

        //래퍼클래스 Long 사용, 약 3300ms 소요
        Long sumWrapper = 0L;//Long 래퍼클래스 오토 박싱
        startTime = System.currentTimeMillis();
        for(int i = 0; i<iterations; i++){
            sumWrapper += i; //계산 과정에서 오토 박싱, 오토 언박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumWrapper);
        System.out.println("wrapper: "+(endTime-startTime)+"ms");
    }
}
