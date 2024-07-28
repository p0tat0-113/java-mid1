package restudying.lang.clazz5;

public class Clazz2 {
    public static void main(String[] args) throws Exception{
        //여기서는 Class 클래스를 이용해서 클래스의 생성자를 읽어오고, 그걸 통해서 인스턴스를 생성해본다.

        Class clazz1 = Test.class;

        //파라미터가 없는 생성자 호출
        Object o1 = clazz1.getDeclaredConstructor().newInstance();//Object타입으로 반환함. 그리고 온갖 체크예외를 다 던져대서 throws Exception 해줬음.
        Test test1 = (Test) o1;
        System.out.println("test1.getNum() = " + test1.getNum());

        //파라미터가 있는 생성자 호출
        Object o2 = clazz1.getDeclaredConstructor(int.class).newInstance(20);
        Test test2 = (Test) o2;
        System.out.println("test2.getNum() = " + test2.getNum());
    }

    static private class Test{
        private int num = 10;

        public Test() {//기본 생성자
        }

        public Test(int num) {//파라미터가 있는 생성자
            this.num = num;
        }

        public int getNum() {
            return num;
        }
    }
}
