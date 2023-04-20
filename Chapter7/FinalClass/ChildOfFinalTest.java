package FinalClass;

public class ChildOfFinalTest extends FinalTest  {
  
  // 부모 클래스의 종단 메소드는 오버라이딩 할 수 없다
  
  @Override
  public String getFirstPlayer()  {
    return 'white';
  }
}
