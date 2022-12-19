package day_02;

import java.util.Arrays;

public class ShellSort {
    public static void sort(double[] array){
        double[] tempArray = Arrays.copyOf(array,array.length);
        int length = tempArray.length;
        double temp;
        for (int step = length/2; step >= 1; step/=2) {
            for (int i = step; i < length; i++) {
                temp = tempArray[i];
                int j = i - step;
                while(j>=0&&tempArray[j]>temp){
                    tempArray[j+step] = tempArray[j];
                    j -= step;
                }
                tempArray[j + step] = temp;
            }
        }
        printArray.printAttay(tempArray);
    }
}
