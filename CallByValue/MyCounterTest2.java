package CallByValue;

public class MyCounterTest2 {
    public static void main(String[] args) {
        MyCounter2 obj = new MyCounter2();
        int x = 10;

        obj.inc(x);
        System.out.println(x);
        // 그리하여 x의 출력은 11이 아닌 10
    }
}
