package MyTest;

public class Box {
  int width;
  int length;
  int height;
  Box(int w, int l, int h) {
    this.width = w;
    this.length = l;
    this.height = h;
  }

  @Override
  public String toString() {
    return "Box [width=" + width + ", length=" + length + ", height=" + height + "]";
  }

  public static void main(String[] args) {
    Box b = new Box(20,20,30);
    System.out.println(b);
  }

}
