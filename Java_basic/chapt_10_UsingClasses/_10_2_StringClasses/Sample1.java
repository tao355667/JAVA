package Java_basic.chapt_10_UsingClasses._10_2_StringClasses;
/*
P273 Sample1.java 取出字符串的长度与字符
 */
public class Sample1 {
    public static void main(String[] args) {
        String str="Hello";
        char ch1=str.charAt(0);
        char ch2=str.charAt(1);
        int len=str.length();
        System.out.println(str+"第1个字符是"+ch1);
        System.out.println(str+"第2个字符是"+ch2);
        System.out.println(str+"的长度是"+len);

    }
}
