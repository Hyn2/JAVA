package ForFinalTest;

public class Television implements RemoteControl{
  public static void main(String[] args) {
    Television t = new Television();
    t.turnOff();
    t.turnOn();
  }
  // 인터페이스에 정의 된 모든 추상메서드를 정의하지 않으면 오류가 발생한다.
  public static boolean onOff = true;
  public void turnOn() {
    onOff = true;
  }

  public void turnOff() {
    onOff = false;
  }
}

/* 추상클래스와 인터페이스의 차이
 * 1. 추상클래스에서는 일반적인 필드를 선언할 수 있다.
 * 2. 인터페이스에서 모든 메서드는 public abstract가 된다.
 */

// 추상클래스를 사용하는 경우
// 관련된 클래스, 정적이 아니거나 상수가 아닌 필드를 선언하고 싶을 때
// 공통적인 필드나 메서드가 많은 경우, public 이외의 접근 제어 지정자를 사용해야 하는 경우

// 인터페이스를 사용하는 경우
// 관련없는 클래스, 특정 자료형의 동작을 지정하고 싶지만 누가 구현하든 상관없을 때, 다중 상속 시