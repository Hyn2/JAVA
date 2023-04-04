package Chapter7.MethodOverriding;

public class Child extends Parant {
    @Override
    public void print() {
        super.print();
        System.out.println("Child class print() method");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}
