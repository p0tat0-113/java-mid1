package restudying.lang.wrapper4;

public class WrapperStart2 {
    public static void main(String[] args) {
        //박싱 - 기본형을 래퍼클래스로 변환
        System.out.println("박싱");
        Integer deprecated = new Integer(10);//이렇게 생성자에 값을 직접대입해도 작동은 되지만 미래에 삭제 예정이기 때문에 사용을 권장하지 않음.
        Integer integer = Integer.valueOf(10);//그래서 래퍼클래스들은 처음에 값을 생성할 때 valueOf()를 써야한다.
        /*
        valueOf도 내부 구조를 까보면 경우에 따라서 내가 했던 것과 똑같이 생성자를 호출하긴 한다.
        그런데 자주쓰는 -128에서 127까지의 객체를 미리 캐싱해놓고 재사용하기 때문에 더 효율적이라고 한다. 문자열 풀과 비슷함.
         */
        System.out.println(integer);//Integer 에서 toString()을 오버라이딩 해뒀음.

        Double doubleObj = Double.valueOf(10);
        Long longObj = Long.valueOf(10);
        System.out.println(doubleObj);
        System.out.println(longObj);

        //언박싱 - 래퍼클래스를 기본형으로 변환
        System.out.println("언박싱");
        int a = integer.intValue();
        System.out.println(a);
        double b = doubleObj.doubleValue();
        System.out.println(b);
        long c = longObj.longValue();
        System.out.println(c);

        //비교 - 반드시 equals()를 사용, 참조형이기 때문
        System.out.println("비교");
        Integer integer1 = Integer.valueOf(10);
        Integer integer2 = Integer.valueOf(10);
        System.out.println("integer1 == integer2 = " + (integer1 == integer2));//얘도 원래는 false 가 나와야 하는데 자주쓰는 값들은 미리 캐싱해둔 객체를 꺼내와서 쓰기 때문에 같은 객체를 참조함.
        System.out.println("integer1.equals(integer2) = " + integer1.equals(integer2));

        //오토 박싱-오토 언박싱 대충 쓰면 컴파일러가 알잘딱 해줌ㅋㅋ
        System.out.println("오토 박싱, 오토 언박싱");

        Integer autoObj = 10;//오토 박싱
        int autoPrimitive = autoObj;//오토 언박싱

        System.out.println(autoObj);
        System.out.println(autoPrimitive);

        autoObj += 10;//이런 연산을 할 때도 자동으로 오토 언박싱 후 연산하고 다시 오토 박싱해서 대입하는 과정이 이루어짐
        System.out.println(autoObj);
    }
}
