package Chapter9.Interface;

public class HelloWorld {
  public void sayHello() {
    Hello engHello = new EnglishGreeting();
    engHello.greetSomeone("world");
    Hello frenchHello = new Hello() {
      @Override
      public void greetSomeone(String someone) {
        System.out.println("Salut tout le monde" + someone);
      }
    };
    frenchHello.greetSomeone("Fred");
    Hello spanHello = null;
    spanHello.greetSomeone("mundo"); //"Hola mundo"
  }
  public static void main(String[]args) {
    HelloWorld hw = new HelloWorld();
    hw.sayHello();
  }
}

interface Hello {
  void greetSomeone(String someone);
}

class EnglishGreeting implements Hello {
  @Override
  public void greetSomeone(String someone) {
    System.out.println("Hello world" + someone);
  }
}


