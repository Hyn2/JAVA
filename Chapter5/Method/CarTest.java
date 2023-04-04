package Chapter5.Method;
public class CarTest {
    public static void main() {
        Car myCar = new Car(); // 참조변수 myCar, Car 객체 생성 및 주소값 저장
        myCar.changeGear(3); // 인자값 3이 Car class의 gear 변수에 저장
        myCar.speedUp(); 
        System.out.println(myCar); // toString() 출력
    }
}
