package Chapter7.Inheritance;

public class Employee {
    public String name;
    String address;
    protected int salary;
    private int rrn;

    public Employee(String name, String address, int salary, int rrn) {
        this.name;
        this.address;
        this.salary;
        this.rrn;
    }

    @Override
    public String toString() {
        return "Employee [Name = " + name + ", Address = " + address + ", Salary = " + salary + ", rrn = " + rrn + "]";
    }
}
