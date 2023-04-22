package Interface;

public class Car2 implements Comparable {
  private String brand;
  private int speed;
  private String model;
  private int price;

  public Car2(String brand, String model, int speed, int price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.speed = speed;
  }

  public Car2() {
    this("unknown", "unknown", 0, 0);
  }

  public String getBrand() {
    return brand;
  }
  public String getModel() {
    return model;
  }
  public int getSpeed() {
    return speed;
  }
  public int getPrice() {
    return price;
  }
  
  @Override
  public int compareTo(Comparable obj) {
    Car aCar = (Car)obj;
    int aPrice = aCar.getPrice();
    if(aPrice == price) {
      return 0;
    } else if( aPrice > price) {
      return 1;
    } else {
      return -1;
    }
  }
  @Override
  public String toString() {
    return "브랜드 : " + brand + " 모델 : " + model + " Speed : " + speed + " Price : " + price;
  }
}
