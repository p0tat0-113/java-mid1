package restudying.lang.string3;

public class StringImmutable3 {
    public static void main(String[] args) {
        //String은 불변이다.
        //앞에서 봤듯이 문자열 풀로 인해서 여러 변수가 같은 String 인스턴스를 참조하는 일이 빈번하게 발생하기 때문 -> 사이드 이펙트 발생

        String str1 = "Hello ";

        str1.concat("world");
        System.out.println(str1);//불변이기 때문에 값을 변경하는 메서드는 꼭 반환값을 받아줘야 한다.

        str1 = str1.concat("world");
        System.out.println(str1);
    }
}
