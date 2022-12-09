package day_01;

public class StringConvert {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        char[] chars = {'1','2','3'};
        String str3 = new String(chars);
        System.out.println(str3.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(str3)));
        System.out.println(str1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(str1)));
        System.out.println(str2.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(str2)));
        System.out.println(str1);
        System.out.println(str2);
    }
}
