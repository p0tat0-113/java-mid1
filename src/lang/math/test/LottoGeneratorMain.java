package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator2 lottoGenerator2 = new LottoGenerator2(6);

        int[] randomNums1 = lottoGenerator2.getRandomNums();

        System.out.print("로또 번호: ");
        for (int randomNum : randomNums1) {
            System.out.print(randomNum+" ");
        }
    }
}
