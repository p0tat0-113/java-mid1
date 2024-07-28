package lang.math.test;

import java.util.Random;

public class LottoGenerator2 {
    private int requestedNums;
    private int[] randomNums;
    private int count;

    public LottoGenerator2(int requestedNums) {
        this.requestedNums = requestedNums;
        randomNums = new int[requestedNums];
    }

    public int[] getRandomNums(){
        Random random = new Random();
        while (count< requestedNums){
            int num = random.nextInt(44)+1;
            if(isUnique(num)){
                randomNums[count] = num;
                count++;
            }
        }
        count = 0;//count를 꼭 0으로 초기화해줘야 함.
        return randomNums;
    }

    private boolean isUnique(int num){
//        if(count == 0){
//            return true;
//        }
        //어차피 count가 0일 때는 아래 반복문이 작동되지 않기 떄문에 굳이 이 코드를 넣을 필요가 없음 바부야

        for(int i = 0; i<count; i++){
            if(randomNums[i] == num){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LottoGenerator2 lottoGenerator2 = new LottoGenerator2(6);
        int[] randomNums = lottoGenerator2.getRandomNums();
        for (int randomNum : randomNums) {
            System.out.println(randomNum);
        }
    }
}
