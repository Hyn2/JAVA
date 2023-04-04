package Chapter7.Inheritance;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    void test() {
        System.out.println("Name = " + name);
        System.out.println("address = " + address);
        System.out.println("Salary = " + salary);
    }
}
