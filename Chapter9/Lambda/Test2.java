package Chapter9.Lambda;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test2 {
  public static void main(String[] args) {
    Person p1 = new Person("a", LocalDate.of(2001, 01, 29), "a@gmail.com", Sex.FEMALE);
    Person p2 = new Person("a", LocalDate.of(2001, 01, 29), "b@gmail.com", Sex.MALE);
    Person p3 = new Person("a", LocalDate.of(2001, 01, 29), "c@gmail.com", Sex.MALE);
    Person p4 = new Person("a", LocalDate.of(2001, 01, 29), "d@gmail.com", Sex.FEMALE);
    Person p5 = new Person("a", LocalDate.of(2001, 01, 29), "ae@gmail.com", Sex.MALE);
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);
    // CheckPerson 인터페이스 객체를 만드는 방법
    // 1. 클래스를 정의하고 그 클래스의 객체를 생성
    // 2. 무명클래스로 생성
    // 3. 람다식으로 생성
    printGender(list, (p)->(p.getGender() == Sex.MALE));
  }

  // Java에서는 유용하게 사용할 수 있는 Functional Interface를 제공하고 있다.
  // Functional Interface는 오직 하나의 추상메소드를 가지는 제네릭 인터페이스.
  // 즉, 특정 타입의 객체를 원하는 곳에는 람다식으로 전달할 수 있다.

  public static void printGender(List<Person> list, CheckPerson cp) {
    for(Person p : list) {

      if(cp.test(p)) {
        System.out.println(p.getName() + "은 남자");
      } else {
        System.out.println(p.getName() + "은 여자");
      }
    }
  }
  public static void printPersonLamda(List<Person> list, Predicate<Person> pred, Consumer<Person> c) {
    for(Person p : list) {

      if(pred.test(p)) {
        c.accept(p);
        System.out.println();
      }
    }
  }
}