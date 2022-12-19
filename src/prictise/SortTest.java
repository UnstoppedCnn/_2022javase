package prictise;

import day_02.BubbleSort;
import day_02.InsertSort;
import day_02.SelectSort;
import day_02.ShellSort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        double[] array = {3.14,2.75,3.68,4.69,0.11,7.24};
//        BubbleSort.sort(array);
//        SelectSort.sort(array);
//        InsertSort.sort(array);
        ShellSort.sort(array);
    }
}
