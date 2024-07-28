package lang.immutable.test;

//불변 객체로 만들어야 하고, set뭐시기 메서드들이 값이 바뀐 객체를 생성해서 통째로 반환하게 해야함.

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //이런 불변객체의 값을 변경하는 메서드들은 관례적으로 "with"로 시작하는 경우가 많다고 한다.
    //예를 들어 "coffee with sugar"라고 하면, 커피에 설탕이 추가되어 원래의 상태를 변경하여 새로운 변형을 만든다는 것을 의미한다.
    //불변 객체의 메서드가 "with"로 이름 지어진 경우, 그 메서드가 지정된 수정사항을 포함하는 객체의 새 인스턴스를 반환한다는 사실을 뜻한다.
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);//월, 일은 그대로 두고 년도만 다른 새로운 객체를 만들어서 반환.
    }
    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }
    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
