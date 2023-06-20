package ForFinalTest;

import java.util.Arrays;
import java.util.List;
import javax.swing.Timer;

public class Lambda {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    list.forEach(n -> System.out.println(n));
    Timer t = new Timer(1000, event -> System.out.println("beep"));
    t.start();
  }
}
