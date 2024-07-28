package lang.object.toString;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    //toString() 오버라이딩
    //toString()이 객체의 경로와 이름, 참조값을 보여준긴 하지만 그것만으로는 제대로 알 수 있는게 없다.
    //그래서 toString()을 오버라이딩해서 유용한 정보를 제공할 수 있도록 재정의 하는게 보통이라고 한다.


    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
    //alt + insert 를 누르면 toString을 선택하면 이 포맷을 자동으로 만들어준다ㄷㄷ
}
