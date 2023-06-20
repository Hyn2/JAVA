package Chapter9.Generic;

import java.util.*;

public class Test5 {
  public static void main(String[] args) {
    Professor p1 = new Professor("홍길동", 40);
    Professor p2 = new Professor("홍길동", 34);
    Professor p3 = new Professor("홍길동", 46);
    Professor p4 = new Professor("홍길동", 53);
    Professor p5 = new Professor("홍길동", 28);

    List<Professor> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);

    print(list);

    System.out.println("정렬 후");
  }

  public static void print(List<Professor> list) {
    for(Professor prof : list) {
      System.out.println(prof.getAge());
    }
  }

  // public static void sort(List<Professor> list) {
  //   Collections.sort(list, (Professor l1, Professor l2) -> {
  //     return l1 - l2;
  //   });
  // }
}
