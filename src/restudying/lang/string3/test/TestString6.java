package restudying.lang.string3.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성

        int count = 0;

        while(str.indexOf(key) != -1){
            count += 1;
            str = str.replaceFirst(key,"");
        }

        System.out.println("count = " + count);
    }
}
