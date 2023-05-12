package Chapter9.Interface;

public class RemoteControlTest {
  public static void main(String[] args) {
    RemoteControl rm = new SamsungTV();
    rm.turnOn();
    rm.turnOff();
    rm.volumeControl(3);

    rm = new LgTV();
    rm.turnOn();
    rm.turnOff();
    rm.volumeControl(3);
    
  }
}
