package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//시간 측정

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100000; i++){
            sb.append("Hello World");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("연산 완료");
        System.out.println(endTime-startTime+"ms");
    }
}
