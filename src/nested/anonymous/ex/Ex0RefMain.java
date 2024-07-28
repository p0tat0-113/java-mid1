package nested.anonymous.ex;
//점점 리팩토링 해볼 것.
//대충 보면 감이 오지. hello(String str)라는 메서드를 만들고, 매개변수를 받아서 매개변수를 출력하는 식으로 고치면 메서드가 재사용 가능해짐.
public class Ex0RefMain {

    //변하지 않는 부분은 그대로 유지하고, 변하는 문자열은 외부에서 전달 받아서 처리한다.
    //단순한 문제였지만, 프로그래밍에서 중복을 제거하는 핵심은 변하는 부분과 변하지 않는 부분을 분리하는 것이다.
    //핵심은 변하는 부분을 메서드에서 들고 있는게 아니라, 외부에서 전달받는 다는 점이다.
    public static void hello(String str) {
        System.out.println("프로그램 시작");//변하지 않는 부분
        System.out.println("Hello " + str);//변하는 부분
        System.out.println("프로그램 종료");//변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
