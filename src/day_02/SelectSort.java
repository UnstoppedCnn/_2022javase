package day_02;

import java.util.Arrays;

public class SelectSort {
    public static void sort(double[] array){
        double[] tempArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length - i; i++) {
            int min = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if(tempArray[j]<tempArray[i]){
                    min = j;
                }
            }
            if (i != min) {
                double tmp = tempArray[i];
                tempArray[i] = tempArray[min];
                tempArray[min] = tmp;
            }
        }
        printArray.printAttay(array);
        printArray.printAttay(tempArray);
    }
}
