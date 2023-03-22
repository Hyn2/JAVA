package TestStatic;

public class MyClass {
    static int x;
    int y;

    // 정적 초기화 블록 : 정적 변수를 초기화하는데 사용
    static {
        x = 10;
        System.out.println("정적 초기화 블록이 호출");
    }
}
