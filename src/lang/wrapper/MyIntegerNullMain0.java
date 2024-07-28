package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        //기본형에도 데이터가 '없음' 즉 null이 필요한 케이스를 보여주는 코드
        int[] arr = {-1,0,1,2,3};

        System.out.println(findValue(arr,-1));//얘는 배열에 들어가있음에도 값이 -1이기 때문에 -1이 반환됨.
        System.out.println(findValue(arr,0));
        System.out.println(findValue(arr,1));
        System.out.println(findValue(arr,100));

    }

    //배열에서 target을 찾으면 그 값을 반환, 없으면 -1 반환
    private static int findValue(int[] arr, int target){
        for (int i : arr) {
            if(i == target){
                return i;
            }
        }
        return -1;
    }
}
