package Chapter7.Polymorphism;

public class Test3 {
    public static void main(String[] args) {
        Student[] stds = new Student[5];
        stds[0] = new Student("김현", "1901076");
        stds[1] = new Student("김현1", "2546135");
        stds[2] = new Student("김현2", "0734513");
        stds[3] = new Student("김현3", "0175125");
        stds[4] = new Student("김현4", "1901135");

        Sort.selectionSort(stds);

        for (int i = 0; i < stds.length; i++) {
            System.out.println(stds[i]);
        }
        
    }

}
