package MyTest;

public class SafeArray {
  private int a[];
  public int length;
  public SafeArray(int index) {
    a = new int[index];
    this.length = index;
  }

  public int get(int index) {
    return a[index];
  }

  public void put(int index, int value) {
    if( 0 < index && index > length) {
      a[index] = value;
    } else {
      System.out.println("wrong index");
    }
  }

  public static void main(String[] args) {
    SafeArray arr = new SafeArray(5);

    for(int i =0; i < arr.length + 1; i++) {
      arr.put(i, i * 10);
    }
  }
}
