package MyTest;

public class Car {
  String color;
  int gear;
  int speed;
  Car(String c, int g, int s) {
    this.color = c;
    this.gear = g;
    this.speed = s;
  }
  void changeGear(int g) {
    this.gear = g;
  }

  void speedUp() {
    speed += 20;
  }

  void speedDown() {
    speed -= 20;
  }
  
  @Override
  public String toString() {
    return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
  }
  
  public static void main(String[] args) {
    Car c = new Car(null, 10 ,1);
    System.out.println(c);
  }
}
