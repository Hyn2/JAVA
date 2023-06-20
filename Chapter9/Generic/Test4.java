package Chapter9.Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {

  public static void main(String[] args) {
    Professor p1 = new Professor("고길동", 40);
    Professor p2 = new Professor("홍길동", 34);
    Professor p3 = new Professor("김길동", 45);
    Professor p4 = new Professor("박길동", 53);
    Professor p5 = new Professor("이길동", 28);

    List<Professor> list = new ArrayList<>();

    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);

    // print(list);

    System.out.println("정렬후");
    // Prof 변경없이 Prof의 객체들을
    // 나이의 오름차순으로 정렬
    // 3가지

    // Collections.sort(list, new MyComparator());

    // Collections.sort(
    //   list,
    //   new Comparator<Professor>() {
    //     @Override
    //     public int compare(Professor o1, Professor o2) {
    //       return o1.age - o2.age;
    //     }
    //   }
    // );

    // Collections.sort(list,(Professor o1, Professor o2) -> {
    //     return o1.age - o2.age;
    //   }
    // );

    // print(list);
  }

  // public static void print(List<Professor> list) {
  //   for (Professor p : list) {
  //     System.out.println("[" + p.name + ", " + p.age + "]");
  //   }
  //   System.out.println();
  // }
}

// class MyComparator implements Comparator<Professor> {

//   @Override
//   public int compare(Professor o1, Professor o2) {
//     return o1.age - o2.age;
//   }
// }
