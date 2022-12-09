package day_01;
//charAt和substring方法都是从第0位索引开始的
//如果substring的括号内只有一个n的话就是从第n+1位字母开始的
//如果有两个的话就是从第n+1到第m+1位字符
public class StringCharAtAndSubstring {
    public static void main(String[] args) {
        String str1 = "HelloJavaAndF**kTheWorld";
        String str2 = str1.substring(12);
        System.out.println(str1);
        System.out.println(str2);
    }
}
