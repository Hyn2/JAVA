package TestStatic;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1, e2, e3;
        e1 = new Employee("Hyun", 10000);
        e2 = new Employee("jihun", 20000);
        e3 = new Employee("daehan", 30000);

        int employeeCount = Employee.getCount();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.printf("현재 직원수 : %n", employeeCount);
    }
}
