package enumeration.ref3;


public class DiscountService {

    public int discount(Grade grade, int price){
        //할인율을 반영한 가격 계산 기능도 Grade가 가지고 있음. DiscountService는 사실상 빈 껍데기가 됨.
        return grade.discount(price);
    }
}
