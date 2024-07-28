package restudying.eumeration;

public class Solution2Main {
    public static void main(String[] args) {
        System.out.println("discount(Solution2.BRONZE) = " + discount(Solution2.BRONZE));
        System.out.println("discount(Solution2.BRONZE) = " + discount(Solution2.SILVER));

        //Solution2 solution2 = new Solution2();//멋대로 인스턴스 생성 불가능

        //짜잔! 문제 해결!
    }

    static int discount(Solution2 GRADE){
        if(GRADE == Solution2.BRONZE) {
            System.out.println("브론즈");
            return 10;
        }
        if(GRADE == Solution2.SILVER) {
            System.out.println("실버");
            return 20;
        }
        if(GRADE == Solution2.GOLD) {
            System.out.println("골드");
            return 30;
        }
        else {
            System.out.println("비회원");
            return 0;
        }
    }
}
