package Chapter6.gettersSetters;

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray();
        array.createArray(10);
        
        array.put(2, 100);
        array.put(2, 10);

        System.out.println(array.get(2));
    }
}
