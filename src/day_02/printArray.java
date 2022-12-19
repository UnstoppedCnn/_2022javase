package day_02;

public class printArray {
    public static void printAttay(double[] array){
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.println(array[i]+"}");
            }else {
            System.out.print(array[i]+",");
            }
        }
    }
    public static void swap(double[] array,int a,int b){
        double temp;
        if(array[a]>array[b]){
            temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
}
