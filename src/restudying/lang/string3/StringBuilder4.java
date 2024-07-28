package restudying.lang.string3;

public class StringBuilder4 {
    public static void main(String[] args) {
        /*
        String은 불변이다. 그래서 값을 바꿀 때마다 객체를 새로 생성해야 함.
        그래서 문자를 자주 더하거나 변경하는 상황에서는 더 많은 String객체를 생성하고, GC해야 한다.
        결과적으로 객체를 생성하는데 더 많은 시간과 메모리를 소비한다. 문자열의 크기가 커질수록, 더 자주 변경할 수록 자원을 더 많이 소모한다.
        (실제로는 자바가 어느정도 최적화를 통해서 해결하긴 함.)

        이 문제를 해결하려면 String의 가변 버전이 있으면 된다. 값을 변경하기 위해 새로운 객체를 생성하지 않아도 되기 때문에 더 효율적이다.(물론 사이드이펙트에 주의해야 함.)
         */

        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);

        sb.append("! Hello");
        sb.append(" Java!!!!!");
        System.out.println(sb);

        sb.delete(24,28);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        String str = sb.toString();//불변 객체 String으로 변환
        //StringBuilder 는 보통 문자열을 변경하는 동안만 사용하다가
        //변경이 끝나면 안전한 String으로 바꾸는 것이 좋다.
        System.out.println(str);
    }
}
