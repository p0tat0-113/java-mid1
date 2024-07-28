package restudying.lang.string3;

//문자열 비교

public class StringEquals2 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        /*
        str1과 str2는 서로 다른 객체를 참조하고 있다.
        그래서 ==으로 동일성을 비교하면 false 가 나오고,
        equals()로 동등성을 비교하면 true 가 나온다.(String 클래스에서 equals()를 오버라이딩 했기 때문에 가능)
        여기까지는 당연한 내용이다.
         */

        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println("str3 == str4 : " + (str3 == str4));
        System.out.println("str3.equals(str4) : " + str3.equals(str4));
        /*
        앞에서와 똑같이 했는데 이번에는 ==로 동일성을 비교했을 때도 true 가 나온다. 왜지?
        그 이유는 문자열 리터럴로 선언할 경우 '문자열 풀'을 사용하기 때문이다.

        자바는 처음에 클래스 정보를 읽으면서 문자열 리터럴이 있으면 문자열 풀에 그 문자열 인스턴스를 딱 하나씩만 중복 없이 생성해둔다.
        그리고 String str3 = "Hello" 이렇게 문자열 리터럴을 사용하면 문자열 풀에서 해당 문자를 가진 인스턴스를 찾아서 반환함.
        String str4 = "Hello" 의 경우에는 문자가 똑같기 때문에 똑같은 인스턴스를 찾아서 반환함.
        결국 str3와 str4는 같은 인스턴스를 참조하게 되는 것이다. <- 뒤에서 다루겠지만 이런 상황때문에 자바는 String을 불변으로 설계함.
        따라서 ==로 동일성을 비교했을 때 true 를 반환함.

        참고로 문자열 풀은 힙영역을 사용한다.
        문자를 찾을 때는 해시 알고리즘을 사용해서 매우 빠른 속도로 원하는 String 인스턴스를 찾을 수 있다고 함.
         */

        //이렇게 선언하는 방식에 따라서 동일할 수도, 동일하지 않을 수도 있기 때문에 문자열을 비교할 때는 무조건 equals()를 사용해야 한다!
    }
}
