package restudying.lang.immutable2;

public class ValueChange {
    public static void main(String[] args) {
        Mutable mutable = new Mutable(10);
        mutable.add(10);//기존의 값은 사라짐.
        mutable.add(10);
        System.out.println(mutable.getNum());

        Immutable immutable = new Immutable(10);
        immutable.add(10);//반환값을 받지 않으면 아무 일도 일어나지 않음.
        Immutable immutable2 = immutable.add(10);//반환값을 받아줘야 함. 기존의 값을 가지고 있는 객체는 그대로 있음.
        immutable2 = immutable2.add(10);
        System.out.println(immutable2.getNum());
    }

    //가변 객체
    static class Mutable{
        private int num;

        public Mutable(int num) {
            this.num = num;
        }

        void add(int num){
            this.num += num;//기존의 속성에 값을 더함.
        }

        public int getNum() {
            return num;
        }
    }

    //불변 객체
    static class Immutable{
        private final int num;

        public Immutable(int num) {
            this.num = num;
        }

        Immutable add(int num){
            //this.num += num;//불변 객체는 속성이 불변이기 때문에 속성에 새로운 값을 대입할 수는 없음.
            return new Immutable(this.num + num);//대신 이렇게 새로운 값으로 초기화된 새로운 객체를 통으로 넘겨줘야 함.
        }

        public int getNum() {
            return num;
        }
    }
}
