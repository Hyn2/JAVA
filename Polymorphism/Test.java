package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Shape s = new Shape();
        //s.draw();
        shapes[0] = s;

        s = new Rectangle();
        //s.draw();
        shapes[1] = s;

        s = new Triangle();
        //s.draw();
        shapes[2] = s;

        s = new Circle();
        //s.draw();
        shapes[3] = s;

        shapes[4] = new Polygon();

        drawShapes(shapes);

    }

    // 객체추가시 배열에 추가하면 됨
    public static void drawShapes(Shape[] shapes) {
        for(Shape s : shapes) {
            s.draw();
        }
        // for(int i = 0; i < shapes.length; i++) {
        //     Shape s = shapes[i];
        //     s.draw();
        // }
        // 위와 같음
    }
}
