### 추상클래스와 인터페이스의 차이
  1. 추상클래스에서는 일반적인 필드를 선언할 수 있다.
  2. 인터페이스에서 모든 메서드는 public abstract가 된다.

### 추상클래스를 사용하는 경우
* 관련된 클래스, 정적이 아니거나 상수가 아닌 필드를 선언하고 싶을 때
* 공통적인 필드나 메서드가 많은 경우, public 이외의 접근 제어 지정자를 사용해야 하는 경우

### 인터페이스를 사용하는 경우
* 관련없는 클래스, 특정 자료형의 동작을 지정하고 싶지만 누가 구현하든 상관없을 때, 다중 상속 시

### 인터페이스의 특징
1. 추상 메서드로 이루어져있음
2. 변수는 선언될 수 없다.
3. 인터페이스에서 정의된 변수는 자동적으로 public static final이다.
4. 인터페이스도 extends 키워드를 이용하여 다른 인터페이스를 상속받을 수 있다.
인터페이스 내에 정의되는 메서드는 묵시적으로 public abstract이다.
또한 메서드는 내부가 정의되지 않으며 이름과 매개변수만 정의된다.

### 인터페이스를 자료형으로 생각하기
예를 들어, Rectangle 클래스와 Circle 클래스는 Shape 인터페이스를 사용하고 있다면
``` Shape s1 = Rectangle r;
    Shape s2 = Circle c;
```
위와 같이 구현한 인터페이스의 참조변수에 대입할 수 있다.

### 인터페이스를 이용한 다중상속
``` 
public interface RemoteControl {
  public void on();
  public void off();
}

public interface RemoteControl2 implements RemoteControl {
  public void up();
  public void down();
}
```
### default / static method
디폴트 메서드를 정의하면 메서드의 몸체를 구현하지 않아도 호출할 수 있음
정적 메서드도 정의 가능 
(JDK 8 부터)