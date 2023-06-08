package Chapter9.Generic;

import Chapter7.Polymorphism.Student;

public class GenericTest {

  public static void main(String [] args) {
    GenericBox<Integer> box1 = new GenericBox<Integer>();
    box1.setValue(100);
    // 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아준다
    // box1.setValue("안녕");
    int val = box1.getValue();
    System.out.printf("박스에 저장된 값은 %d 입니다.", val);


    // 값만 잘 지정해주면 명시적인 타입 캐스팅이 필요없다.
    GenericBox<String> box2 = new GenericBox<String>();
    box2.setValue("안녕하세요");
    String sVal = box2.getValue();
    System.out.println(sVal);

    // 왼쪽에 제네릭 클래스으 ㅣ적용할 타입이 명시되어 있기 때문에
    // 오른쪽 부분에서 객체를 생성할 때는 타입 파라미터를 생략 할 수 있다.
    GenericBox<Student> box3 = new GenericBox<>();
    Student std = new Student("안녕", "1");
    box3.setValue(std);

    Student val3 = box3.getValue();
    System.out.println("박스에 저장된 값은" + val3 + "입니다.");
  }

}