package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a"); //가변객체이기 때문에 따로 반환값을 받지 않아도 됨.
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println("append: "+sb);

        sb.insert(4,"JAVA");//4번째, 즉 맨 뒤에 JAVA를 삽입
        System.out.println("insert: "+sb);

        sb.delete(4,8);//4에서 8까지 삭제
        System.out.println("delete: "+sb);

        sb.reverse();//반전
        System.out.println("reverse: "+sb);

        //StringBuilder -> String
        String string = sb.toString();//불변객체 String으로 변환
        System.out.println("toString: "+string);
        //StringBuilder 는 보통 문자열을 변경하는 동안만 사용하다가
        //문자열 변경이 끝나면 안전한(불변) String으로 변환하는 것이 좋다.
    }
}
