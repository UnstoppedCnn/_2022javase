package day_02;

import java.util.Arrays;

public class InsertSort {
    public static void sort(double[] array){
        double[] tempArray = Arrays.copyOf(array,array.length);
        for (int i = 1; i < tempArray.length; i++) {
            int j;
            if(tempArray[i] < tempArray[i-1]){
                double temp = tempArray[i];
                for (j = i - 1; j >= 0&& tempArray[j]>=temp; j--) {
                    tempArray[j+1] = tempArray[j];
                }
                tempArray[j+1] = temp;
            }
        }
        printArray.printAttay(tempArray);
    }
}
