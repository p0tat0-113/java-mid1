package restudying.eumeration;

public enum Grade5 {
    //enum도 클래스이기 때문에 당연히 메서드들을 가질 수 있음!!!

    BRONZE(10),SILVER(20),GOLD(30);
    //뒤에 괄호를 붙이면 생성자에 값을 넣어줄 수가 있음!

    private final int discountPercent;

    Grade5(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int calculate(int price){
        return price * discountPercent / 100;
    }

    public static void main(String[] args) {
        int price = 10000;
        System.out.println(Grade5.BRONZE.calculate(price));
        System.out.println(Grade5.SILVER.calculate(price));
        System.out.println(Grade5.GOLD.calculate(price));
    }
}
