package Chapter9.Generic;
import java.util.*;

public class CollectionTest {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("안");
    names.add("녕");
    names.add("하");
    names.add("세");
    names.add("요");

    for (String name : names) {
      System.out.println(name);
    }
  }
}