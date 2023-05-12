package Chapter9.Interface;

public class AnonymousTest {
  public static void main(String[] args) {
    RemoteControl r1 = new SamsungTV();
    r1.turnOff();
    RemoteControl r2 = new LgTV();
    r2.turnOn();
    RemoteControl r3 = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("turn on sonyTV");
      }
      @Override
      public void turnOff() {
        System.out.println("turn off sonyTV");
      }
    };
    r3.turnOn();
    // 여기서 문제, Student 클래스를 상속 받는 무명클래스를 생성하고
    // 이름을 출력
    // 무명클래스를 만들 때 부모클래스 이름은 인터페이스 이름을 포함한 용어
    // new 부모클래스이름(인자리스트) {클래스의 정의}
    // 무명클래스를 만들 때의 제약 사항 : 새로운 생성자를 정의할 수 없다.
    // 무명클래스는 클래스의 이름이 없기에 생성자를 만들 수 없다.
    // 또한 부모 클래스의 이름으로 생성자를 만들 수도 없다.
    Student std1 = new Student("김현", "컴정") {
      @Override
      public String getName() {
        return "안녕" + super.getName() + "입니다.";
      }
    };
    System.out.println(std1.getName());   
  }

}

/* 
보통은 객체를 생성하고자 한다면,
1. 그 객체의 틀이 되는 클래스를 선언
2. new 연산자를 이용하여 그 클래스의 객체를 생성
public class A {
  public A(String name) {...}
}

A a = new A("일지매") {
  ...
}; #public class B extends A { }, A a2 = new B();

public interface Aif {
  ...
}

public class MyClass implements Aif {
  ...
}

Aif aif = new MyClass();

Aif aif2 = new Aif() {
  ....
};

무명클래스 표현식의 구성은 다음과 같다.
 * 1. new 연산자
 * 2. 구현할 인터페이스 일므 또는 상속할 클래스 이름
 * 3. 괄호() -> 생성자에게 전달할 인자를 포함하는 괄호
 *    주의 : 인터페이스를 구현하는 경우, 인터페이스는 생성자가 없기 때문에
 *          괄호는 어떠한 인자도 포함하지 않는다.
 * 4. 몸체 : 클래스 정의 부분
 * 5. 세미콜론
 * 
 * 무명 클래스란 : 클래스의 정의와 객체 생성을 한 문장으로 해결하는 것
 */