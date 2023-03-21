package Test;

public class MyCounter {
private int value;
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public static void addOne(int val) {
        val = val + 1;
    }
    public static void increase(MyCounter cntObj) {
        int v= cntObj.getValue() + 1;
        cntObj.setValue(v);
    }

    public static void main(String[]args) {
        // int val = 10;
        // MyCounter.addOne(val);
        // System.out.println(val);
        MyCounter mc = new MyCounter(); 
        mc.setValue(10);
        MyCounter.increase(mc);
        System.out.println(mc.getValue());
    }
}
