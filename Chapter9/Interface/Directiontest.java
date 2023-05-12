package Chapter9.Interface;

public class Directiontest implements Direction{
  public static void main(String[] args) {
    System.out.println(Direction.WEST);
    System.out.println(Direction.EAST);
    //Direction.EAST = 100; 상수는 값 변경 불가

  }
}