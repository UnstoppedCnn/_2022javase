package prictise;

import day_02.SelectSort;
import day_02.bubbleSort;
import day_02.printArray;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        double[] array = {3.14,2.75,3.68,4.69,0.11,7.24};
        double[] temp = Arrays.copyOf(array,array.length);
//        bubbleSort.sort(array);
        SelectSort.sort(array);
        printArray.printAttay(array);
    }
}
