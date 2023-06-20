package ForFinalTest;
interface MyInterface {
  void sayHello();
}

public class LambdaTest {
  public static void main(String[] args) {
    MyInterface hello = () -> System.out.println("Hello Lambda");
    hello.sayHello();
    // 람다식과 무명클래스의 차이
    // 무명클래스는 this가 무명클래스를 가리키지만 람다식에서는 this가 람다식이 작성된 클래스를 가리킴
  }
}