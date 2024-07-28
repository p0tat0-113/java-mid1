package enumeration.ref3;


public class ClassGradeRefMain3 {
    public static void main(String[] args) {
        int price = 10000;
        //출력 부분 반복되는 코드 제거
        printDiscount(Grade.BASIC,price);
        printDiscount(Grade.GOLD,price);
        printDiscount(Grade.DIAMOND,price);
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.discount(price));
    }
}
