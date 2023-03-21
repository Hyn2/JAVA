package CBV;

public class ArrayProcTest2 {
    final static int STUDENTS = 5;
    public static void main(String [] args) {
        int[] scores = new int[STUDENTS];

        ArrayProc2 obj = new ArrayProc2();
        obj.getValue(scores);
        System.out.println(obj.getAverage(scores));
    }
}
