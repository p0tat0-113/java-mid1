package restudying.lang.string3;

public class StringOptimization6 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello java! ");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("소요 시간: "+(endTime-startTime)+"ms");//9ms 씹ㅋㅋㅋㅋ

        //String을 썼을 때에 비해서 성능이 엄청나게 향상되었다.
    }
}
