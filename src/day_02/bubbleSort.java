package day_02;

public class bubbleSort {
    public static void sort(double[] array){
        if(array.length<=1){
            return;
        }
        System.out.println(array.length);
        double temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]<array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
