package day_01;

/**
 *
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "java是世界上最好的语言.cpp,c语言是世界上最好的语言.java,python是世界上最好的语言.c,r语言是世界上最好的语言.py,rust是世界上最好的语言.rs";
        String[] theBestLanguage = str.split(",");
        for (int i = 0; i < theBestLanguage.length; i++) {
            System.out.println(theBestLanguage[i]);
        }
    }
}
