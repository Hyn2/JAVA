package Chapter9.Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;

public class CallbackTest {
  public static void main(String[] args) {
    ActionListener l  = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      System.out.println("Beep");
      } 
    };
    Timer timer = new Timer(1000, l);
    timer.start();

    Scanner scn = new Scanner(System.in);
    System.out.println("input");
    scn.nextLine();
    scn.close();
    System.out.println("종료함");
  }
}

class Myclass implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Beep");
  }
}
