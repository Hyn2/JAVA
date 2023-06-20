package ForFinalTest;

public interface RemoteControl {
  /* 인터페이스의 특징
  * 1. 추상 메서드로 이루어져있음
  * 2. 변수는 선언될 수 없다.
  * 3. 상수는 정의 가능
  * 4. 인터페이스도 extends 키워드를 이용하여 다른 인터페이스를 상속받을 수 있다.
  인터페이스 내에 정의되는 메서드는 묵시적으로 public abstract이다.
  또한 메서드는 내부가 정의되지 않으며 이름과 매개변수만 정의된다.
  */
  void turnOn();
  void turnOff();
}