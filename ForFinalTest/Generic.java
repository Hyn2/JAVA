package ForFinalTest;

public class Generic {
  public static void main(String[] args) {
    Box<String> a = new Box();
    a.print("nulasdfl");
    Box<Integer> b = new Box();
    b.print(123);
    // 하나하나 명시적으로 형변환을 해주는 것보다 객체 생성 시에 자료형을 정해주면
    // 항상 형변환을 해야하는 번거로움과 런타임 오류가 발생할 수 있다.
  }
}

class Box<T> {
  void print(T data) {
    System.out.println(data);
  }
}