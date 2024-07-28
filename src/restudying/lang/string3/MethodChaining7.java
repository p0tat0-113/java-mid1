package restudying.lang.string3;

class MethodChaining7 {
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.add(10);
        test1.add(10);
        test1.add(10);
        System.out.println(test1);
        //이렇게 값을 더할 수도 있다.
        //그런데 add()는 this를 반환한다. this가 뭐지? 바로 자기 인스턴스의 참조값이다. 참조값이 있으면? .을 찍어서 메서드를 호출할 수 있다.
        //이렇게 this를 반환하는 메서드들을 쭉 잇는 것이 바로 메서드 체이닝이다!

        Test test2 = new Test();
        test2.add(10).add(10).add(10);//add()는 계속 자기 자신의 인스턴스를 반환한다.
        System.out.println(test2);
        //코드가 훨씬 간결해짐!

        //그래서 이걸 왜 했냐면 바로 StringBuilder 의 값과 관련된 메서드들도 this를 반환하기 때문에 메서드 체이닝을 쓸 수 있기 때문이다.
        String str = new StringBuilder().append("Hello").append(" Java!").reverse().toString();
        System.out.println(str);

        //꼭 this를 반환해야만 메서드 체이닝을 할 수 있는건 아님. 참조값을 반환하기만 하면 됨.
        //그 말인 즉슨 새로운 객체의 참조값을 반환하는 불변객체의 값변경 메서드들에도 메서드 체이닝을 써먹을 수 있다는 것임.
        str = "";
        str = str.concat("Hello").concat(" World").toUpperCase();
        System.out.println(str);
    }

    //숫자를 더하는 add()라는 메서드를 가지고 있는 간단한 클래스를 만들었다.
    //특이한 점은 add()가 this를 반환한다.
    static private class Test{
        private int num;

        Test add(int num){
            this.num += num;
            return this; //this, 즉 인스턴스 자기 자신의 참조값을 반환한다.
        }

        @Override
        public String toString() {
            return "Test{" +
                    "num=" + num +
                    '}';
        }
    }
}
