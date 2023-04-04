package Chapter6.StaticMember;

public class Car {

    private String model;
    private String color;
    private int speed;

    // 상수 : 한번 초기화되면 절대 값을 변경할 수 없는 값
    // 상수는 static으로 선언하는 것이 바람직
    // 상수는 대문자
    // 일반적으로 public으로 선언
    static final int MAX_SPEED;
    static {
        MAX_SPEED = 500;
        System.out.println("최대 속도가 초기화 되었습니다.");
    }
    // 자동차의 시리얼 넘버
    private int id;
    // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 함
    private static int numbers = 0;

    // static method가 맞나, instance method가 맞나? : static.
    // static method는 instance method를 호출할 수 있다, 없다 : 없다
    public static int getNumbers() {
        return numbers;
    }

    // instance method : instance가 생성되어야만 존재하는 메소드
    void print() {
        System.out.println("Hello World");
    }

    Car(String argModel, String argColor, int argSpeed) {
        id = ++numbers;
        model = argModel;
        color = argColor;
        speed = argSpeed;
        System.out.printf("ID : %d, Model : %s, Color : %s, Speed : %d%n", id, model, color, speed);
    }

}
