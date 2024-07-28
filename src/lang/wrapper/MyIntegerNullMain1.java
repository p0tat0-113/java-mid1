package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        //기본형에도 데이터가 '없음' 즉 null이 필요한 케이스를 보여주는 코드
        MyInteger[] arr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};

        System.out.println(findValue(arr,-1));//findValue는 MyInteger객체 혹은 null을 반환한다.
        System.out.println(findValue(arr,0));//MyInteger에서 toString을 오버라이딩 했기 때문에 안에 든 값이 출력됨.
        System.out.println(findValue(arr,1));
        System.out.println(findValue(arr,100));

    }

    //배열에서 target을 찾으면 그 값을 반환, 없으면 -1 반환
    private static MyInteger findValue(MyInteger[] arr, int target){//MyInteger 타입으로 반환
        for (MyInteger myInteger : arr) {
            if(myInteger.getValue() == target){
                return myInteger;//배열에 들어있던 myInteger객체를 그대로 반환
            }
        }
        return null;//값이 없다면 null을 반환함.
    }
}
