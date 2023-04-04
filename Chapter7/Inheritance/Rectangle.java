package Chapter7.Inheritance;

public class Rectangle extends Shape {
    private int width;
    private int height;

    double area() {
        return width * height;
    }

    void draw() {
        System.out.printf("x : %d, y : %d, 면적 : %f", getX(), getY(), area());
    }
}
