package lang.wrapper;

public class MyInteger {
    //직접 만든 wrapper클래스
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target){
        if(value < target){
            return -1;
        } else if (value == target) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return ""+value;//toString은 String을 반환해야하기 때문에 숫자를 문자로 바꿔줘야 함.
        //String.valueOf(value); 이렇게 해도 됨.
    }
}
