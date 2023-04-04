package Chapter7.Inheritance;

public class AnimalTest {
    
    public static void main(String [] args) {
        Lion l = new Lion();
        l.eat();
        l.sleep();
        l.roar();
        System.out.println("\n--------------------------------\n");
        Eagle e = new Eagle();
        e.eat();
        e.sleep();
        e.fly();
    }

}
