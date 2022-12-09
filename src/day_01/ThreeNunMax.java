package day_01;

import java.util.Random;

public class ThreeNunMax {
    public static void main(String[] args) {
        Random random = new Random();
        double one = random.nextDouble(100);
        double two = random.nextDouble(100);
        double three = random.nextDouble(100);
        double temp = (one>two)?one:two;
        double maxOfThree = temp>three?temp:three;
        double maxOfThree1 = (one>two)?(one>three?one:three):(two>three?two:three);
        System.out.println(maxOfThree);
        System.out.println(maxOfThree1);
        System.out.println(one+"po"+two+"mo");
    }
}
