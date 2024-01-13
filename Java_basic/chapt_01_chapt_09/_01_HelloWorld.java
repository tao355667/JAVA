/*
 * 1-初见Java
 * 多行注释
 */
//java单行注释
package Java_basic.chapt_01_chapt_09;

public class _01_HelloWorld {
    public static void main(String[] args) {// main方法
        System.out.print("Hello Java!");// 使用print,最后无换行
        System.out.println("你好 Java！");// 使用println,最后有换行
        System.out.println(123 + 321);// 使用数字
        System.out.println('S');// 使用字符
        System.out.println("123\t456\tC:\\myfiles\\123.txt");// 使用转义字符
        System.out.println("十进制的10是" + 10 + "。");// 拼接字符串和数字
        System.out.println("八进制的10是" + 010 + "。");// 拼接字符串和数字
        System.out.println("16进制的10是" + 0x10 + "。");// 拼接字符串和数字
        System.out.println("16进制的F是" + 0xF + "。");// 拼接字符串和数字
    }
}
