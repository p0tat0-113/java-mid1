package restudying.eumeration;

public class Grade3Main {
    public static void main(String[] args) {
        System.out.println("discount(Grade3.BRONZE) = " + discount(Grade3.BRONZE));
        System.out.println("discount(Grade3.BRONZE) = " + discount(Grade3.SILVER));

        System.out.println("Grade3.BRONZE = " + Grade3.BRONZE);
        System.out.println("Grade3.SILVER = " + Grade3.SILVER);
        System.out.println("Grade3.GOLD = " + Grade3.GOLD);

        //아래 출력결과를 통해서, 세 상수는 같은 타입의 서로 다른 인스턴스를 참조하고 있음을 확인할 수 있다.
        System.out.println(Grade3.BRONZE.getClass().getTypeName());
        System.out.println(Grade3.SILVER.getClass().getTypeName());
        System.out.println(Grade3.GOLD.getClass().getTypeName());

        System.out.println(Integer.toHexString(System.identityHashCode(Grade3.BRONZE)));
        System.out.println(Integer.toHexString(System.identityHashCode(Grade3.SILVER)));
        System.out.println(Integer.toHexString(System.identityHashCode(Grade3.GOLD)));
    }

    static int discount(Grade3 GRADE){
        if(GRADE == Grade3.BRONZE) {
            System.out.println("브론즈");
            return 10;
        }
        if(GRADE == Grade3.SILVER) {
            System.out.println("실버");
            return 20;
        }
        if(GRADE == Grade3.GOLD) {
            System.out.println("골드");
            return 30;
        }
        else {
            System.out.println("비회원");
            return 0;
        }
    }
}
