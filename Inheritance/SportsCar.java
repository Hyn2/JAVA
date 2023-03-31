package Inheritance;

public class SportsCar extends Car {
    boolean turbo;

    public void setTurbo(boolean flag) {
        turbo = flag;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", Turbo : " + turbo;
    }
}
