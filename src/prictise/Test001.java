package prictise;

import java.util.Scanner;

//统计字符串中各种字符的数量
public class Test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要操作的字符串");
        String input = sc.next();
        int countNum = 0,countLower = 0,countUpper = 0,countOther = 0;
        char[] temp = input.toCharArray();
        for (char ch : temp) {
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNum++;
            } else {
                countOther++;
            }
        }
        System.out.println("字符中大写字母有"+countUpper+"个");
        System.out.println("字符中小写字母有"+countLower+"个");
        System.out.println("字符中数字有"+countNum+"个");
        System.out.println("字符中其他字符有"+countOther+"个");
    }
}
