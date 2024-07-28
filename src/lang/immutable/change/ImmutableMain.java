package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutableObj1 = new ImmutableObj(10);

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        ImmutableObj immutableObj2 = immutableObj1.add(20);//계산 결과는 새로운 객체를 생성해서 반환
        System.out.println(immutableObj1.getValue());//기존 객체의 값은 바뀌지 않음.
        System.out.println(immutableObj2.getValue());

        //만약 반환 값을 따로 받지 않는다면 아무 일도 일어나지 않는 것처럼 보인다.
        immutableObj1.add(20);
        System.out.println(immutableObj1.getValue());
        //불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 꼭! 반환 값을 받아야 한다.
        //불변 객체에 값을 변경하는 기능이 있다면 이건 반환값을 따로 받아야 겠구나 라고 생각하면 된다고 함.
    }
}
