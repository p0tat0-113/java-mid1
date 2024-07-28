package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        //자바 래퍼 클래스

        //.valueOf()
        //Deprecated, 미래에 삭제예정이기 때문에 컴파일 에러 표시가 뜨지만 실행은 잘 됨.
        //설명을 보면 대신에 .valudOf()를 쓰라고 함.
        //영한 아저씨말로는 자바는 호환성에 목숨을 걸기 때문에 없어지기까지 꽤 오래걸릴 것이라고 함.
        Integer newInteger = new Integer(10);
        System.out.println(newInteger.toString());//Integer클래스도 toString메서드를 오버라이딩 해놓았기 때문에 이렇게 값이 출력된다.

        //valueOf도 구조를 까보면 결국 new Integer()를 반환한다.
        //근데 자주쓰는 -128에서 127까지의 숫자를 미리 캐싱해놓고 재사용하기 때문에 더 효율적이라고 한다. 파이썬이랑 똑같네.
        //문자열 풀과 비슷한 방식
        Integer integerObj = Integer.valueOf(10);
        System.out.println(integerObj);

        Long longObj = Long.valueOf(100);//long과 double도 똑같이 valueOf를 씀.
        Double doubleObj = Double.valueOf(100);
        System.out.println(longObj);
        System.out.println(doubleObj);

        //언박싱
        System.out.println("내부 값 반환"); //래퍼클래스에 박싱되어 있는 기본형 값을 반환. 언박싱한다고 한다.
        int intValue = integerObj.intValue();
        System.out.println(intValue);
        long longValue = longObj.longValue();
        System.out.println(longValue);

        //비교
        System.out.println("비교");
        System.out.println("==로 비교: "+(newInteger == integerObj));//서로 다른 객체이기 때문에 당연히 동일하지 않음.
        System.out.println("equals로 비교: "+newInteger.equals(integerObj));//Integer에서 equals()를 오버라이딩 했기 때문에 가능

        //참고
        Integer test1 = Integer.valueOf(10);
        Integer test2 = Integer.valueOf(10);
        System.out.println(test1 == test2);
        //valueOf로 생성하면 미리 캐싱해둔 곳에서 똑같은걸 가져오기 때문에 동일함. 딱히 중요한건 아님.
        //그냥 비교할 때는 equals()로 하기!
    }
}
