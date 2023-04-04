package Chapter6.Constructor_Overloading;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = y;
        this.y = x ; 
    }

    //부모로부터 상속받은 메소드를 재정의 하는 것을 오버라이딩이라고 한다.
    // overriding
    @Override
    public String toString() {
        return "x : " + x + ", y :" + y;
    }
}

// 자바 책 270까지
