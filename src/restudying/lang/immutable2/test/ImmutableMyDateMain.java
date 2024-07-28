package restudying.lang.immutable2.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("2025 -> date1");
        date1 = date1.setYear(2025);//불변 객체의 변경 메서드. 반환값을 받아줘야 함.
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}