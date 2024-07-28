package enumeration.ex2;

public class DiscountService {
    //더이상 문자가 아닌 ClassGrade타입(인스턴스)을 받는다.
    //그리고 ClassGrade 인스턴스를 전해줄 수 있는 유일한 수단은 열거해 놓은 ClassGrade의 BASIC,GOLD,DIAMOND 상수들 뿐이다.
    //(사용자가 마음대로 ClassGrade의 인스턴스를 생성하지 못하게 생성자를 private으로 해야함.)

    public int discount(ClassGrade classGrade, int price){
        int discountPercent = 0;

        if(classGrade == ClassGrade.BASIC){
            discountPercent = 10;
        } else if(classGrade == ClassGrade.GOLD){
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }
        return price * discountPercent / 100;
    }
}
