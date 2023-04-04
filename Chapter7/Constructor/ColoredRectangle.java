package Chapter7.Constructor;

public class ColoredRectangle extends Rectangle {
    String color;

    public ColoredRectangle(int x, int y, int width, int height, String color) {
        super(x, y, width, height);
        System.out.println("Hi! I'm ColoredRectangle");
        this.color = color;
    }

    public static void main(String[] args) {
        ColoredRectangle obj = new ColoredRectangle(10, 10, 30, 30, "Yellow");
    }
}
