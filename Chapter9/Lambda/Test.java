package Chapter9.Lambda;

import java.time.LocalDate;
import java.util.*;

public class Test {

  public static void main(String[]args) {
    Person p1 = new Person("홍길동", LocalDate.of(2000, 1, 4), "hey@gmail.com", Sex.MALE);
    Person p2 = new Person("김지훈", LocalDate.of(2000, 1, 4), "hoho@gmail.com", Sex.FEMALE);
    Person p3 = new Person("김현 ", LocalDate.of(2001, 1, 29), "hihi@gmail.com", Sex.MALE);

    // List는 인터페이스, 이 인터페이스를 구현하는 클래스로
    // ArrayList, LinkedList 등이 있다.
    List<Person> list = new ArrayList<Person>();
    list.add(p1);
    list.add(p2);
    list.add(p3);

    printPersonOlderThan(list, 12);
    printPersonsWithinAgeRange(list, 21, 22);

  }
  // collection framework : list Set, Map, Stack, Queue
  // collection framework는 여러 개의 값을 저장하는 자바의 자료구조
  // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다
  // list-Person, Set<Integer>, Map<String, Person>, ...
  public static void printPersonOlderThan(List<Person> persons, int age) {
    // persons 리스트의 각 원소에 대해서 반복문을 수행한다
    // 각 원소를 Person 타입의 변수 p에 저장
    for (Person p : persons) {
      if (p.getAge() >= age) {
        System.out.println(p.printPers());
      }
    }
  }
  // List<Person> list, int low, int high
  // 위 세개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(low 이상, high 미만)을
  // 입력으로 받아, 해당하는 나이 범위의 Person 정보만 출력하는 메소드
  // printPersonsWithinAgeRange 메소드를 구현
  public static void printPersonsWithinAgeRange(List<Person> persons, int low, int high) {
    for (Person p : persons) {
      if (low < p.getAge() && p.getAge() <= high) {
        System.out.println(p.printPers());
      }
    }
  }
  // Perso 객체의 리스트와 CheckPerson 인터페이스를 구현한 객체 tester를 전달받고,
  // 리스트의 각 Person 객체를 tester.test 메소드의 인자로 전달해, 그 반환 값이 true이면
  // 그 Person 객체의 정보를 출력
  public static void printPersons(List<Person> list, CheckPerson tester) {
    for (Person p:list) {
      if(tester.test(p)) {
        System.out.println(p.printPers());
        System.out.println();
      }
    }
  }

}

interface CheckPerson {
  boolean test(Person p);
}

class CheckPersonMale18to25 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
  }
}
