package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception{//체크 예외
        //Class 조회
        Class clazz = String.class;//1. 클래스에서 조회
        //Class clazz = new String().getClass();//2. 인스턴스에서 조회
        //Class clazz = Class.forName("java.lang.String");//3. 문자열로 조회, 이걸 쓰려면 위에 체크 예외를 넣어줘야 함. 사용자의 입력을 받아서 객체를 만들 수도 있음.

        //모든 필드를 출력
        Field[] declaredField = clazz.getDeclaredFields(); //String의 모든 필드를 가져온다.
        for (Field field : declaredField) {
            System.out.println(field);
        }
        for (Field field : declaredField) {
            System.out.println("field: "+field.getType()+" "+field.getName());//Field객체로부터 타입과 이름을 받아올 수도 있음.
        }

        //모든 메서드를 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("Method: "+declaredMethod);
        }


        //상위 클래스 정보 출력
        System.out.println("SuperClass: "+clazz.getSuperclass().getName());//String은 따로 지정된 슈퍼클래스가 없어서 Object클래스가 출력됨.

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("interface: "+anInterface.getName());
        }

    }
}
