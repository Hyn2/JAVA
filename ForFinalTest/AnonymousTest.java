package ForFinalTest;

public class AnonymousTest {
  
  public static void main(String[] args) {
    Anonymous a = new Anonymous() {
    public void turnOff() {
      System.out.println("turnOn");
    }

    public void turnOn() {
      System.out.println("turnOff");
    }
  };
  
  a.turnOn();
  a.turnOff();
  }
}
