package Chapter6.Constructor;

public class MyCounterTest {
    public static void main(String[] args) {
        MyCounter obj1 = new MyCounter(10);
        MyCounter obj2 = new MyCounter(1000);
        System.out.println("객체 1의 Counter : " + obj1.counter);
        System.out.println("객체 2의 Counter : " + obj2.counter);
    }
}
