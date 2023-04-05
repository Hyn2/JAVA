package Chapter7.Polymorphism;

class Shape {
    protected int x,y; // 모든 자식 클래스에 포함될 변수를 부모 클래스에 넣음
}

class Rectangle extends Shape {
    private int width, weight;  // 부모 클래스에 포함 된 x,y 이외에 추가로 변수를 가짐
}

class Triangle extends Shape {
    private int base, height;
}

class Circle extends Shape {
    private int radius;
}

public class ShapeTest {
    public static void main(String[] args) {
        // Shape s1, s2;
        // s1 = new Shape();
        // s2 = new Rectangle();  자식 클래스는 항상 부모 클래스를 포함하기에 부모 클래스의 변수로 자식 클래스 객체를 참조할 수 있다. (상향 형변환)

        Shape s = new Shape();
        Rectangle r = new Rectangle();

        s.x = 0;
        s.y = 0;

        // s.width() = 100;
        // s.height() = 100; 참조변수 s를 통해서는 Rectangle 클래스의 필드, 메서드에 접근이 불가함. Shape 타입의 참조변수이기에..

        
    }
}
