package CallByValue;

public class MyCounterTest3 {
    public static void main(String [] args) {
        MyCounter3 obj = new MyCounter3();
        System.out.println(obj.value);
        obj.inc(obj);
    }
}
