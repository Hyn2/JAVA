package Chapter7.Inheritance;

public class Animal {
    private double weight;
    private String picture;

    void eat() {System.out.println("eat()가 호출되었음");}
    
    void sleep() {System.out.println("sleep()가 호출되었음");}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weightArgs) {
        this.weight = weightArgs;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
