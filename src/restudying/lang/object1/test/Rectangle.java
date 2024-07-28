package restudying.lang.object1.test;

import java.util.Objects;

/*
다음 코드와 실행 결과를 참고해서 Rectangle 클래스를 만들어라.
Rectangle 클래스에 IDE의 기능을 사용해서 toString() , equals() 메서드를 실행 결과에 맞도록 재정의해라.
rect1 과 rect2 는 넓이( width )와 높이( height )를 가진다. 넓이와 높이가 모두 같다면 동등성 비교에 성공해야 한다.
 */

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }
}
