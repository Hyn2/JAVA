package Chapter9.Interface;

public class SamsungTV implements RemoteControl{

  @Override
  public void turnOn() {
    System.out.println("삼성 TV를 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("삼성 TV를 끕니다");
  }
  
  // java 8 version 부터는 interface가 default method 와 static method를 가질 수 있음
  // void changeChannel () {
  //   System.out.println("삼성 TV 채널을 바꿉니다.");
  // }

  // static void volumeUp () {
  //   System.out.println("삼성 TV의 볼륨을 높입니다.");
  // }
}