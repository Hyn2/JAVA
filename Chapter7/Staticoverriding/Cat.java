package Chapter7.Staticoverriding;

public class Cat extends Animal {
  public static void eat() {
    System.out.println("고양이 밥 먹어요");
  }

  @Override
  public void sound() {
    System.out.println("soundofcat");
  }
}
