package Interface;

public class Student implements Comparable {
  private String name;
  private String dept;
  public Student(String name, String dept) {
    this.name = name;
    this.dept = dept;
  }
  public String getName() {
    return name;
  }
  public String getDept() {
    return dept;
  }
  // null인 경우는 없다고 가정
  // interface는 class처럼 데이터 타입으로 사용될 수 있다.
  // 특정 interface 타입의 변수는 그 interface를 구현하는
  // 모든 클래스(와 그 클래스의 모든 후손 클래스)의 객체를 담을 수 있다.
  @Override
  public int compareTo(Comparable obj) {
    // 
  }
}
