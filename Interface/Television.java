package Interface;
// RemoteControl 인터페이스를 Television 클래스에 구현(implements)한것 
public class Television implements RemoteControl {
  boolean onOff = false;
  public void turnOn() {
    onOff = true;
  }
  public void turnOff() {
    onOff = false;
  }
}
