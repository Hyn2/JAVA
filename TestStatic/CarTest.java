package TestStatic;

public class CarTest {
    public static void main(String[] args) {
        Car c1, c2, c3;
        c1 = new Car("bnr34", "white", 80);
        c2 = new Car("bnr35", "black", 80);
        c3 = new Car("bnr32", "silver", 80);
        System.out.println("생성된 자동차 수 : " + Car.getNumbers());

        // 자바의 수학 관련 라이브러리 클래스는 정적 메서드를 사용
        double d = Math.sqrt(9);
        System.out.println("9의 제곱근 : " + d);
    }

}
