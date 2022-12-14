package day_01;
//对字符串操作的方法
public class StringReplace {
    public static void main(String[] args) {
        String dirtyWord = "你玩的真厉害";
        String clearWord = dirtyWord.replace("玩的真厉害","*****");
        System.out.println(dirtyWord);
        System.out.println(clearWord);
    }
}
