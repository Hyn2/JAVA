package ForFinalTest;

public class Car implements CarInterface {
  public int speed = 0;
  public boolean startStop = false;
  public int degree = 0;
  public void setSpeed(int speed) {
    this.speed = speed;
    System.out.println(speed);
  }

  public void turn(int degree) {
    this.degree = degree;
    System.out.println(degree);
  }

  public void start() {
    System.out.println("Go");
  }

  public void stop() {
    System.out.println("Stop");
  }
}
