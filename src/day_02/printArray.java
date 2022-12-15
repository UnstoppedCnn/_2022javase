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
}
