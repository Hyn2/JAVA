package ForFinalTest;

// 인터페이스
public interface Remotecontrol2 {
  public void turnOn();
  //public void turnOff();
}

// 일반적인 클래스
class Tv implements Remotecontrol2 {
  // public void turnOff() {
  //   System.out.println("꺼짐");
  // }

  public void turnOn() {
    System.out.println("켜짐");
  }
}

// 무명 클래스
class Tv2 {
  Remotecontrol2 remocon = new Remotecontrol2() {
    @Override
    public void turnOn() {
      System.out.println("on");
    }

    // @Override
    // public void turnOff() {
    //   System.out.println("off");
    // }  
  };
}
// 람다식
class tv3 {
  public static void main(String[] args) {   
    Remotecontrol2 remocon2 = () -> System.out.println("on");
    remocon2.turnOn();
  }
}

class GenericTest<T> {
  private T data;
  public GenericTest(T data) {
    this.data = data;
  }
  public void print() {
    System.out.println(data);
  }

  public static void main(String[] args) {
    GenericTest<String> gt = new GenericTest<>("엄준식");
    gt.print();
  }
}