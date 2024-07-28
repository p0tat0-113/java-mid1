package lang.math.test;
//문제 설명
//로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
//로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
//각 숫자는 중복되면 안된다.
//실행할 때 마다 결과가 달라야 한다.

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        int nums = 6;
        String randomNums = "";

        for(int i = 0; i < nums; i++){
            String randomNum;
            while(true){
                Random random = new Random();
                randomNum = String.valueOf(random.nextInt(44)+1)+" ";//valueOf: 다양한 타입을 문자열로 변환한다.
                if(randomNums.indexOf(randomNum) == -1){//앞에 뽑힌 숫자들과 중복되지 않는다면 랜덤 숫자 뽑기를 멈추고 반복문을 빠져나감.
                    break;
                }
            }
            randomNums += randomNum;
        }
        System.out.println(randomNums);
    }
}
