package enumeration.ref3;


public class ClassGradeRefMain4 {
    public static void main(String[] args) {
        int price = 10000;
        //Grade에 새로운 등급이 추가되어도 여기서는 변경되는 코드가 하나도 없도록 수정
        Grade[] values = Grade.values();//values를 이용하면 열거형의 모든 상수를 배열 형태로 얻을 수 있다.

        printDiscount(values,price);
    }

    private static void printDiscount(Grade[] values, int price){
        for (Grade value : values) {
            System.out.println(value.name()+" | "+value.discount(price));
        }
    }
}
