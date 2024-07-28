package restudying.lang.object1.poly1;

public class ToString2 {
    public static void main(String[] args) {
        Object o = new Object();
        String s = o.toString();
        System.out.println(s);
        //Object가 제공하는 toString() 메서드는 객체의 이름과, 참조값을 16진수로 변환한 값을 보여준다.

        System.out.println(o);
        //근데 toString()을 따로 쓰지 않고 바로 print 에 넣어도 똑같은 결과가 나온다.
        //print()도 내부적으로 toString()을 호출하기 때문
    }
}
