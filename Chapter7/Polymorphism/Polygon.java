package Chapter7.Polymorphism;

public class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("다각형을 그립니다.");
    }
}
