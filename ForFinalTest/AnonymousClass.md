## 무명클래스 (Anonymous Class)
* 무명클래스는 클래스를 정의함과 동시에 객체를 생성한다.
* 부모클래스를 상속받거나 인터페이스를 정의할 수 있다.

* 주요 문법은 아래이다
아래 예제는 Anonymous 인터페이스를 정의하는 무명클래스이다.
```
Anonymous a = new Anouymous() {
  public void turnOn() {
    System.out.println("on");
  }
  public void turnOff() {
    System.out.println("off");
  }
};
```

### 무명클래스의 특징
1. 선언과 동시에 객체를 생성한다.
2. `new` 뒤에 이미 존재하는 클래스나 인터페이스를 적을 시 그것에 상속받는다.
3. 클래스를 닫는 괄호에는 ;(세미콜론)을 붙인다.
4. 외부클래스에 정의된 필드와 메서드를 사용할 수 있지만 지역변수는 상수만 가능하다.