package restudying.lang.wrapper4;

//여기서는 기본형인 int 를 클래스로 감싸서 래퍼클래스로 만들어 볼 것이다.
//이렇게 해서 메서드를 제공하고, null 값을 가지는 등 객체지향적으로 사용할 수 있다.

public class MyInteger1 {
    private final int num;

    public MyInteger1(int num) {
        this.num = num;
    }

    //크기를 비교하는 메서드
    //객체는 이렇게 자신의 속성을 이용한 메서드를 가질 수 있지만, 기본형은 항상 외부의 메서드를 가져다 써야 한다.
    public int compareTo(int num){
        if (this.num < num){
            return -1;
        } else if (this.num == num) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
