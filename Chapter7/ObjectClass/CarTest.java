package Chapter7.ObjectClass;

public class CarTest {
    public static void main(String[] args) {
        // Car car = new Car();
        // Class classVar = car.getClass();
        // System.out.println(classVar.getName());
        // System.out.println("브랜드 : " + car.brand + "\n모델 : " + car.model);
        Car car1 = new Car();
        Car car2 = new Car("hd","gd");
        System.out.println(car1.equals(car2));
        // .equals() 메소드는 주소값이 같은지 여부를 확인하여 boolean 값으로 리턴한다.
    }
}
