package Chapter7.Inheritance;

public class Employee {
    public String name;
    String address;
    protected int salary;
    private int rrn;

    public Employee(String nameArgs, String addressArgs, int salaryArgs, int rrnArgs) {
        this.name = nameArgs;
        this.address = addressArgs;
        this.salary = salaryArgs;
        this.rrn = rrnArgs;
    }

    @Override
    public String toString() {
        return "Employee [Name = " + name + ", Address = " + address + ", Salary = " + salary + ", rrn = " + rrn + "]";
    }
}
