package ForFinalTest;

public class Rectangle implements Comparable {
  private int width;
  private int height;

  Rectangle(int w, int h) {
    this.width = w;
    this.height = h;
  }  

  @Override
  public String toString() {
    return "Rectangle [width : " + width + "], [height : " + height + "]";
  }

  public int getArea() {
    return this.width * this.height;
  }

  @Override
  public int compareTo(Object o) {
    Rectangle r = (Rectangle)o; // 오브젝트로 받아서 형변환
    if(this.getArea() > r.getArea()) {
      return 1;
    } else if (this.getArea() < r.getArea()) {
      return -1;
    } else {
      return 0;
    }
  }
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(100, 2);
    Rectangle r2 = new Rectangle(200, 2);
    System.out.println(r1.compareTo(r2));
    
  }  
}
