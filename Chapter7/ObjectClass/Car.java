package Chapter7.ObjectClass;

public class Car {
    String brand;
    String model;

    // Constructor
    public Car(String brandArg, String modelArg) {
        this.brand = brandArg;
        this.model = modelArg;
    }

    public Car() {
        this("Unknown", "Unknown");
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        // obj가 Car 클래스의 인스턴스가 아니면, 바로 false를 반환하자.
        // 자바에는 이 목적으로 사용할 수 있는 연산자가
        // instanceof 가 있다
        if(obj instanceof Car == false) return false;
        // 하향 형변환
        Car c = (Car)obj;
        System.out.println(c.brand);
        System.out.println(brand);
        // 그래야, Car 클래스 인스턴스의 brand model 멤버에 접근할 수 있다.
        if(c.brand.equals(brand) && c.model.equals(model)) {
            return true;
        }
        return false;
    }
}
