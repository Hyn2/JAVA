package Chapter9.AnonymousClass;

interface RemoteControl {
  void turnOn();
  void turnOff();
}

public class AnonymousTest {
  public static void main(String[] args) {
    RemoteControl ac = new RemoteControl() {
      public void turnOn() {
        System.out.println("TV turnOn()");
      }
      public void turnOff() {
        System.out.println("TV turnOff()");
      }
    };

    ac.turnOff();
    ac.turnOn();
  }
}