package Chapter9.Interface;

public class CarTest {
  public static void main(String[] args) {
    Car c = new Car();
    c.start();
    c.setSpeed(50);
    c.turn(14);
    c.stop();
  }
}
