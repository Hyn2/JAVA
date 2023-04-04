package Chapter6.Constructor_Overloading;

public class Rectangle {

    // 변수
    private int x, y;
    private int width, height;

    // 생성자
    // 3개의 생성자는 각각 매개변수가 다르기에 여러 개 생성할 수 있다.
    // 이를 메소드 오버로딩이라고 한다.
    // 컴파일러가 인수의 개수와 타입을 보고 호출할 생성자를 결정.

    Rectangle() {
        this(0, 0, 1, 1);
    }

    Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void print() {
        System.out.printf("%d, %d, %d, %d%n", x, y, width, height);
    }

    public static void main(String[]args) {
        // 객체 생성
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(1, 2, 3, 4);
        Rectangle r3 = new Rectangle(5, 6);


        // 각각 지정된 값에 따라 다르게 출력
        r1.print();
        r2.print();
        r3.print();
    }
}
