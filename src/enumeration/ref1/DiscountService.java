package enumeration.ref1;
public class DiscountService {

    public int discount(ClassGrade classGrade, int price){
        //등급 자체가 값을 가지고 있기 때문에 중간에 있던 if 문을 싹 지울 수 있음.
        return price * classGrade.getDiscountPercent() / 100;
    }
}
