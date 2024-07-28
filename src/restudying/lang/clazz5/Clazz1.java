package restudying.lang.clazz5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Clazz1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //자바에서 Class 클래스는 객체의 메타데이터를 얻고 다루는데 사용된다.
        //실행중인 자바 애플리케이션 내에서 필요한 클래스의 속성과 메서드에 대한 정보를 조회하고 조작할 수 있다.
        /*
        주요 기능
        1.타입 정보 얻기: 클래스의 이름, 슈퍼클래스, 인터페이스, 접근제어자 등과 같은 정보를 조회할 수 있댜.
        2.리플렉션: 메서드, 필드, 생성자 등을 조회하고 그걸 통해서 인스턴스를 생성하거나, 메서드를 호출할 수 있다.
        3.동적 로딩과 생성: Class.forName()으로 클래스를 동적으로 로드하고, newInstance()메서드로 새로운 인스턴스를 생성할 수 있다.
        4.애노테이션 처리: 클래스에 적용된 애노테이션을 조회하고 처리하는 기능을 제공한다.
         */

        //Class 조회, 3가지 방법이 있다.
        Class clazz1 = String.class;
        Class clazz2 = new String().getClass();//인스턴스로부터 얻음.
        Class clazz3 = Class.forName("java.lang.String");//forName()은 체크예외를 발생시키기 때문에 throws 를 선언해줘야 함.

        //모든 필드를 출력
        Field[] declaredFields = clazz1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            System.out.println("타입: "+declaredField.getType()+" 이름: "+declaredField.getName());
            //Field 객체로부터 타입과 이름을 얻어올 수도 있다.
        }

        //모든 메서드를 출력
        Method[] declaredMethods = clazz1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
            //여기에서도 반환타입, 이름등을 얻어올 수도 있다.
        }

        //슈퍼 클래스 정보 출력
        Class superclass = clazz1.getSuperclass();
        System.out.println(superclass);

        //인터페이스 정보 출력
        Class[] interfaces = clazz1.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }
}
