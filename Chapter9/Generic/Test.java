package Chapter9.Generic;

public class Test {
  public static void main(String[] args) {
    // IntBox ib = new IntBox();
    // ib.setValue(10);
    // System.out.println(ib.getValue());

    // IntBox ib2 = new IntBox();
    // ib2.setValue(20);

    // int result = ib.getValue() + ib2.getValue();
    // System.out.println(result);

    // StrBox sb1 = new StrBox();
    // sb1.setValue("안녕");
    // StrBox sb2 = new StrBox();
    // sb2.setValue("하세요");

    // String result = sb1.getValue() + sb2.getValue();
    // System.out.println(result);


    // int idx = result.indexOf("하세요");
    // result.substring(idx);

    Box b1 = new Box();
    b1.setValue(20);

    Box b2 = new Box();
    b2.setValue(30);

    int result = (int)b1.getValue() + (int)b2.getValue();
    System.out.println(result);

    Box strBox = new Box();
    strBox.setValue("안녕하세요 앙녕하세요 암녕하세요 안녕하세여 안영하세염");
    Object v = strBox.getValue();
    int idx = ((String)v).indexOf("앙녕하세요");
    System.out.println(((String)v).substring(idx));

    int val = (int)strBox.getValue();
    System.out.println("프로그램을 종료합니다.");
  }
}
