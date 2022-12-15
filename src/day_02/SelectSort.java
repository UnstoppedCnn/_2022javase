package day_02;

public class SelectSort {
    public static void sort(double[] array){
        for (int i = 0; i < array.length - i; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j]<array[i]){
                    min = j;
                }
            }
            if (i != min) {
                double tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }
}
