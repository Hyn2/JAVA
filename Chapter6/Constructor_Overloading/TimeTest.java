package Chapter6.Constructor_Overloading;

public class TimeTest {
    
    public static void main(String[] args) {
        Time t = new Time();
        System.out.println(t);
        Time t2 = new Time(13,27,6);
        System.out.println(t2);
    }

}
