package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int price = 10000;

        //아직 문제가 있음. 사용자가 ClassGrade의 인스턴스를 직접 생성해서 discount의 인수로 넘겨버릴 수도 있다.
        //이런경우 문법적으로는 아무 문제가 없지만, 존재하지 않는 등급이 들어가버리는 격이기 때문에 문제가 발생한다.

        /*ClassGrade classGrade = new ClassGrade();
        System.out.println(discountService.discount(classGrade,price));*/

        //이 문제를 해결하려면 외부에서 classGrade인스턴스를 생성하지 못하도록 생성자를 private으로 막아야 한다.
        //지금은 막아놓았기 때문에 new ClassGrade();로 인스턴스 생성을 시도하면 컴파일 오류가 발생함.
    }
}
