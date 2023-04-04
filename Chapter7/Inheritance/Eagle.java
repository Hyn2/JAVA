package Chapter7.Inheritance;

public class Eagle extends Animal {
    private int wings = 2;

    public int getWings() {
        return wings;
    }

    public void setWing(int wings) {
        this.wings = wings;
    }
    
    void fly() {System.out.println("fly()가 호출되었음");}
}
