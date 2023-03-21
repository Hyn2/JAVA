package Constructor_Overloading;

public class Car2 {
    private int speed;
    public Car2() {
        System.out.println("속도는 " + speed);
    }
    // 인스턴스 초기화 블록(instance initialization block)
    // 생성자가 오버로딩되도 공통적으로 카피
    {
        speed = 100;
    }
    public Car2(String name) {
        System.out.println("속도는 " + speed);
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2();
        System.out.println(c1.speed);
        System.out.println(c2.speed);
    }
}


