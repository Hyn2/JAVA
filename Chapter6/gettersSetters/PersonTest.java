package Chapter6.gettersSetters;

public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person();
        p.setMyAge(20);
        p.getMyDept();
        System.out.println(p.getMyAge());
        System.out.println(p.getName());
    }
    
}
