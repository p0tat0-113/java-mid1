package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString 결과 출력
        System.out.println(string);
        //직접 출력
        System.out.println(object);

        //결과
        //java.lang.Object@10f87f48
        //java.lang.Object@10f87f48
        //패키지를 포함한 객체의 이름과 참조값을 16진수로 변환한 값을 반환함.

        //둘의 결과가 같은 이유는 println()이 내부적으로 toString()을 호출하기 때문이다.
        //따라서 객체 정보를 출력하고 싶을 때 굳이 String string = object.toString();이런 과정을 거치지 않고 바로 println()에 객체를 집어넣으면 된다.

    }
}
