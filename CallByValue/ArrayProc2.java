package CallByValue;

import java.util.Scanner;

public class ArrayProc2 {
    
    void getValue(int [] array) {
        for(int i = 0; i < array.length; i++) {
            Scanner scn = new Scanner(System.in);
            System.out.println("성적을 입력 : ");
            array[i] = scn.nextInt();
            if(i == array.length - 1) {
                scn.close();
            }
        }
    }

    public double getAverage(int[] array) {
        int total = 0;
        double average = 0;

        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }

        average = total / array.length;

        return average;
    }

}
