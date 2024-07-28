package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)을 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis: " + currentTimeMillis);

        //현재 시간(나노초)을 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano: "+currentTimeNano);

        //환경 변수를 읽는다. os에서 사용하는 환경변수의 값을 얻을 수 있다.
        System.out.println("get env: "+ System.getenv());

        //시스템 속성을 읽는다. 자바에서 사용하는 환경변수 값을 얻을 수 있다.
        System.out.println("properties: "+System.getProperties());
        System.out.println("Java version: "+System.getProperty("java.version"));

        //배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] newArray = new char[5];
        System.arraycopy(originalArray,0,newArray,0,originalArray.length);
        //반복문으로 하나하나 복사하려면 오래걸림. 시스템 레벨에서 최적화된 메모리 복사 연산을 사용한다.

        System.out.println(newArray);
        System.out.println(Arrays.toString(newArray));

        //프로그램 종료
        System.exit(0);//0이면 정상 종료, 0이 아니면 오류나 예외적인 종료
        //프로그램이 의도치 않게 뒷정리 하는 과정없이 종료될 수 있기 때문에 별로 권장하지는 않는다고 함.
        //예를 들어 웹어플리케이션 같은 경우 사용자의 요청을 완료하기도 전에 프로그램이 종료되어버릴 수 있어서 쓰면 안된다고 함.
    }
}
