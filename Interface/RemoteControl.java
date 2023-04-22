package Interface;

public interface RemoteControl {
  // 추상 메소드 정의
  // 인터페이스 안에 선언되는 메소드들은 모두 묵시적으로 public abstract 이기때문에,
  // 그에 해당하는 수식어는 없어도 됨니당
  public void turnOn();
  public void turnOff();
}
