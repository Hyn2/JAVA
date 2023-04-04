package Test;

import java.util.Random;

public class sortingTest {
    public static void main(String[] args) {
        int arr[] = new int[10];
        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = (int)(Math.random() * 10);
        //     System.out.println(arr[i]);
        // }
        Random random = new Random(System.currentTimeMillis());

        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("정렬 전");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sorting.sort(arr);

        System.out.println("정렬 후");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}
