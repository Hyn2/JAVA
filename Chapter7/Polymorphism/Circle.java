package Chapter7.Polymorphism;

public class Circle extends Shape {
    private int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Circle["+width+", "+height+"]");
    }

}

