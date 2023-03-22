package CallByValue;

public class ArrayProc {
    void inc(int [] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }
}
