package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random();
        Random random = new Random(1);//seed가 같으면 랜덤의 결과가 항상 똑같다.
        //생성자를 비워두면 내부에서 현재 시간에 복잡한 알고리즘을 섞어서 씨드값을 생성한다.

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();//0.0d~1.0d
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        //범위 조회
        int randomRange = random.nextInt(10);//0~9 출력
        System.out.println(randomRange);

        randomRange = random.nextInt(10)+1;//1~10 출력
        System.out.println(randomRange);

        //씨드값이 같으면 같은 숫자들이 같은 패턴으로 나옴.
        Random random1 = new Random(1);
        System.out.println(random1.nextInt(10));
        System.out.println(random1.nextInt(10));
        System.out.println(random1.nextInt(10));
        System.out.println(random1.nextInt(10));
    }
}
