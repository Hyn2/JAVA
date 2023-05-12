package Chapter9.Interface;

public class Test {
  public static void main(String[] args) {
    // String s1 = "BBC";
    // String s2 = "BBC";
    // System.out.println(s1.compareTo(s2));
    Car2[] cars = new Car2[5];
    Car2 c1 = new Car2("Hyundai", "VelosterN", 250, 4000);
    cars[0] = c1;
    Car2 c2 = new Car2("Nissan", "BNR35", 300, 20000);
    cars[1] = c2;
    Car2 c3 = new Car2("Nissan", "BNR34", 280, 10000);
    cars[2] = c3;
    Car2 c4 = new Car2("Nissan", "BNR33", 250, 9000);
    cars[3] = c4;
    Car2 c5 = new Car2("Nissan", "BNR32", 250, 9000);
    cars[4] = c5;

    for(Car2 car : cars) {
      System.out.println(car);
    }
    // System.out.println(c3);
    // findLarger(c1, c2);
    // Student [] stds = new Student[5];
    // Student std1 = new Student("일지매", "컴정");
    // stds[0] = std1;
    // Student std2 = new Student("일지매1", "컴정");
    // stds[1] = std2;
    // Student std3 = new Student("일지매2", "컴정");
    // stds[2] = std3;
    // Student std4 = new Student("일지매3", "컴정");
    // stds[3] = std4;
    // Student std5 = new Student("일지매4", "컴정");    
    // stds[4] = std5;

    // for(Student std : stds) {
    //   System.out.println(std.getName());
    // }
  }

  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다.");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다.");
    } else {
      System.out.println("두번째가 크다.");
    }
  }
}
