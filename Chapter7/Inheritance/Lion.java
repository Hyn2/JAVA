package Chapter7.Inheritance;

public class Lion extends Animal {
    private int legs = 4;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    void roar() {System.out.println("roar()가 호출되었음");}
}
