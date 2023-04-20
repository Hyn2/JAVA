package Chapter7.Staticoverriding;

public class Animal {
  // 모든 애니멀 클래스의 인스턴스가 공유하는 정적 메서드
  public static void eat() {
    System.out.println("동물이 밥을 먹어요");
  }
  // sound는 instance method이다.
  // 즉, 객체가 생성되어야만 존재할 수 있는 메소드이다.
  public void sound() {
    System.out.println("Sound OF Animal");
  }
}
