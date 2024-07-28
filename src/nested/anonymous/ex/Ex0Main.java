package nested.anonymous.ex;
//점점 리팩토링 해볼 것.
//대충 보면 감이 오지. hello(String str)라는 메서드를 만들고, 매개변수를 받아서 매개변수를 출력하는 식으로 고치면 메서드가 재사용 가능해짐.
public class Ex0Main {
    public static void helloJava() {
        System.out.println("프로그램 시작");//변하지 않는 부분
        System.out.println("Hello Java");//변하는 부분
        System.out.println("프로그램 종료");//변하지 않는 부분
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");//변하지 않는 부분
        System.out.println("Hello Spring");//변하는 부분
        System.out.println("프로그램 종료");//변하지 않는 부분
    }
    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
