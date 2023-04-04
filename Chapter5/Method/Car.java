package Chapter5.Method;
public class Car {
    String color; // 색상
    int speed; // 속도
    int gear; // 기어
    public String toString() { // 리턴 값 String으로 반환
        return "Car [Color = " + color + "Speed = " + speed + "Gear = " + gear + ']';
    }

    void changeGear(int g) { //매개변수 g를 gear 변수에 저장
        gear = g;
    }
    void speedUp() { 
        speed += 10; //speed = speed + 10
    }

    void speedDown() {
        speed -= 10; //speed = speed - 10
    }
}
