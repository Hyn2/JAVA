package Chapter6.gettersSetters;
public class SafeArray {
    private int[] a;

    public void createArray(int size) {
        a = new int[size];
    }

    public int get(int index) {
        if(index >= 0 && index < a.length)
            return a[index];
        System.out.println("잘못된 인덱스 : " + index);
        return -1;
    }
    public void put(int index, int value) {
        if(index >= 0 && index < a.length) {
            a[index] = value;
        } else {
            System.out.println("잘못된 인덱스 : " + index);
        }
    }
}

  