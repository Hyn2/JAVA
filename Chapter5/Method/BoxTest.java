package Chapter5.Method;

public class BoxTest {
    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.width = 29;
        b.length = 30;
        b.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", " + b.height + "입니다.");
    }
}
