package Chapter9.Interface;

interface MyInterface {
  public void myMethod1();
  
  default void myMethod2() {
    System.out.println("myMethod()");
  }
  
}

public class DefaultMethodTest implements MyInterface {
  public void myMethod1() {
    System.out.println("myMethod1()");
  }

  public static void main(String[] args) {
    DefaultMethodTest obj = new DefaultMethodTest();
    obj.myMethod1();
    obj.myMethod2();
  }
}
