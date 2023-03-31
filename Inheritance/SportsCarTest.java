package Inheritance;

public class SportsCarTest {
    public static void main(String[] args) {
        SportsCar obj = new SportsCar();
        obj.speed = 10;
        obj.setSpeed(60);
        obj.setTurbo(true);
        System.out.println(obj);
    }
}
