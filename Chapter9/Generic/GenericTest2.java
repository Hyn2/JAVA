package Chapter9.Generic;

public class GenericTest2 {

  public static void main(String[] args) {
    GenericPair<Integer, String> p1 = new GenericPair<>(1, "ㅁㄴㅇㄹ");
    int num = p1.getKey();
    String text = p1.getValue();
    System.out.println("Text : " + text);
    System.out.println("num : " + num);
    // Generic 클래스의 타입 파라미터 값으로는 반드시 참조형이 와야함, 기초자료형은 절대 올 수 없다.
    // 하지만 타입 파라미터로 기초자료형의 배열은 올 수 있다.
    int [] numArr = {10,89,22,12};
    GenericPair<String, int[]> p2 = new GenericPair<String,int[]>("Array", numArr);
  }

  
}