package day_02;

import java.sql.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void sort(double[] array){
        if(array.length<=1){
            return;
        }
        System.out.println(array.length);
        double temp;
        double[] tempArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray.length-i-1; j++) {
                printArray.swap(tempArray,j,j+1);
            }
        }
        printArray.printAttay(tempArray);
    }
}
