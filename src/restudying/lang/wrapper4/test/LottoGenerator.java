package restudying.lang.wrapper4.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private int count = 0;
    private String[] nums = new String[6];

    public String[] getLottoNum(){
        for (int i = 0; i < nums.length; i++) {
            Random random = new Random();
            while(true){
                int randomNum = random.nextInt(45)+1;//1~45 랜덤한 숫자를 반환
                if (!isIn(randomNum)){
                    nums[count++] = String.valueOf(randomNum);
                    break;
                }
            }
        }
        count = 0;
        return nums;
    }

    private boolean isIn(int randomNum){
        for (int i = 0; i < count; i++) {
            if(nums[i].equals(String.valueOf(randomNum))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        String[] lottoNum = lottoGenerator.getLottoNum();
        System.out.println("로또 번호: " + String.join(" ",lottoNum));
    }
}
