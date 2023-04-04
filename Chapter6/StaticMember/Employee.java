package Chapter6.StaticMember;

public class Employee {
    // 변수 선언
    private String name;
    private double salary;
    private static int count;

    // 생성자
    public Employee(String nameArgs, double salaryArgs) {
        name = nameArgs;
        salary = salaryArgs;
        count++;
    }

    // 객체가 소멸될 때 호출
    protected void finalize() {
        count--;
    }

    public static int getCount() {
        return count;
    }
    
}   
