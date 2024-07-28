package restudying.eumeration;

public class Problem1 {
    public static void main(String[] args) {
        /*이 문제를 발전시켜보면서 enum의 필요성에 대해서 알아볼 것이다.
        discount()는 회원 등급을 입력받아서 할인율을 반환해주는 간단한 기능이다.
        여기서는 지금 회원 등급을 문자열로 받는다.
         */

        System.out.println("discount(\"BRONZE\") = " + discount1("BRONZE"));
        System.out.println("discount(\"GOLD\") = " + discount1("GOLD"));
        //잘 작동하는 듯 하다. 그런데 문제가 있음.

        System.out.println("discount(\"gold\") = " + discount1("gold"));//데이터 일관성 부족
        System.out.println("discount(\"diamond\") = " + discount1("diamond"));//타입 안정성 부족
        //이렇게 discount()를 쓰는 사람이 오타를 내버리거나, 없는 등급을 입력하면 오류가 발생을 한다.
        //이런 오류는 문법상 아무런 문제가 없기 때문에 컴파일러가 잡아내지 못한다. 런타임 에러라서 디버깅하기가 매우 힘들어짐.


        //그러면 문자열 상수를 한 번 이용해 보자!
        System.out.println("discount2(Grade.BRONZE) = " + discount2(Grade.BRONZE));
        System.out.println("discount2(Grade.BRONZE) = " + discount2(Grade.SILVER));
        //System.out.println("discount2(Grade.BRONZE) = " + discount2(Grade.DIAMOND));//상수 이름을 잘못 넣으면 컴파일 에러가 발생함.
        //이제 좀 문제가 해결된 것 같기도 하다. 그런데 문제는 여전히 입력받는 타입이 String 이라는 것이다. 쓰는 사람이 모르고 그냥 문자열을 쳐넣어도 아무런 문제가 없음.

        System.out.println("discount2(\"silver\") = " + discount2("silver"));
        System.out.println("discount2(\"diamond\") = " + discount2("diamond"));
        //결국 근본적인 문제는 해결되지 못함.

        /*
        좋아 이제 어떤 문제가 있는지를 파악했으니까 이 문제를 근복적으로 해결하려면 어떻게 해야할지를 생각해보자.
        우선 입력값으로 String 같은걸 받으면 안됨. 쓰는 사람이 모르고 아무 값이나 처넣을 수 있음.

        그러면 입력 받는 타입은 사용자가 새로 만든 타입(인스턴스의 참조값)이어야 함. 그래도 여전히 쓰는 사람이 모르고 그 타입의 인스턴스를 만들어서 집어넣을 수가 있음
        그러므로 그 타입의 인스턴스를 함부로 만들지 못하게 하고, 미리 만들어진 인스턴스들만 쓸 수 있게 해야한다.
         */

    }

    static int discount1(String grade){
        if(grade.equals("BRONZE")) {
            System.out.println("브론즈");
            return 10;
        }
        if(grade.equals("SILVER")) {
            System.out.println("실버");
            return 20;
        }
        if(grade.equals("GOLD")) {
            System.out.println("골드");
            return 30;
        }
        else {
            System.out.println("비회원");
            return 0;
        }
    }

    static int discount2(String grade){
        if(grade.equals(Grade.BRONZE)) {
            System.out.println("브론즈");
            return 10;
        }
        if(grade.equals(Grade.SILVER)) {
            System.out.println("실버");
            return 20;
        }
        if(grade.equals(Grade.GOLD)) {
            System.out.println("골드");
            return 30;
        }
        else {
            System.out.println("비회원");
            return 0;
        }
    }

    static class Grade{
        public static final String BRONZE = "BRONZE";
        public static final String SILVER = "SILVER";
        public static final String GOLD = "GOLD";
    }
}
