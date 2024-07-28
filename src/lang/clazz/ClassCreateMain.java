package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        //Class helloClass = Class.forName("lang.clazz.Hello"); //사용자의 입력을 받아서 객체를 만들 수도 있음.

        //getDeclaredConstructor()으로 생성자를 선택, newInstance()로 선택된 생성자를 기반으로 인스턴스 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();//이 메서드는 기본적으로 Object타입으로 반환하기 때문에 다운캐스팅 해줘야 함.
        System.out.println("instance Type: " + helloClass.getDeclaredConstructor().newInstance().getClass().getTypeName());
        //위 과정을 통해 생성된 인스턴스의 타입을 확인해보면 Hello임을 알 수 있다. 그래서 Hello로 다운캐스팅이 가능한 것

        String result = hello.hello();
        System.out.println(result);
    }
}
