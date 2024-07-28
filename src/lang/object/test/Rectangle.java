package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //println(Rectangle rectangle) 했을 때 참조값이 아니라 Rectangle{width=100, height=20}이런 포맷으로 출력되게 해야함.
    //즉 Rectangle에서 toString()을 오버라이딩해서 println()에서 내부적으로 toString()을 호출할 때 오버라이딩된 toString()이 호출되게 해야한다.
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    //가로와 세로 길이가 같으면 논리적으로 동등하다고 정의하게 해야함.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }
}
