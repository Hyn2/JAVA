package Chapter9.Lambda;

import java.util.*;

public class LambdaTest {
  
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("ddd");
    list.add("CCC");
    list.add("AAA");
    list.add("EEE");
    list.add("bbb");

    System.out.println("정렬전");
    printList(list);
    Collections.sort(list, (s1, s2) ->s1.compareToIgnoreCase(s2));
    System.out.println("\n정렬후");
    printList(list);
  }




  public static void printList(List<String> list) {
    for(String s : list) {
      System.out.println(s);
    }
  }
}
