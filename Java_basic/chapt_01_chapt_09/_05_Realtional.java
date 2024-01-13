/*
 * 5-Java关系运算
 * 关系运算，if，循环
 * 条件：condition
 * 注意逻辑运算符的短路特性
 */
package Java_basic.chapt_01_chapt_09;

import java.io.*;

public class _05_Realtional {
    public static void main(String[] args) {
        // 关系运算符。返回true或false
        System.out.println("5>3 = " + (5 > 3));
        System.out.println("5<3 = " + (5 < 3));
        System.out.println("5==3 = " + (5 == 3));
        System.out.println("5!=3 = " + (5 != 3));
        // if语句
        System.out.print("请输入一个整数：");
        int a = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            a = Integer.parseInt(str);
        } catch (IOException e) {
            // ignore
        }
        if (a != 0)
            System.out.println("a = " + a + " , a!=0！");
        System.out.println("if语句结束！");
        // if~else语句
        if (a > 6)
            System.out.println("a = " + a + " , a>6！");
        else
            System.out.println("a = " + a + " , a<=6！");
        System.out.println("if~else语句结束！");
        // if~else if~else
        if (a == 1)
            System.out.println("a = " + a + " , a是1！");
        else if (a == 2)
            System.out.println("a = " + a + " , a是2！");
        else
            System.out.println("a = " + a + " , a既不是1，又不是2！");
        System.out.println("if~else if~else语句结束！");
        // switch case
        System.out.print("请输入一个整数（0~7）：");
        int num = 0;
        try {
            String str = br.readLine();
            num = Integer.parseInt(str);
        } catch (IOException e) {
            // ignore
        }
        switch (num) {
            case 0:
                System.out.println("执行case 0");
            case 1:
                System.out.println("执行case 1");
            case 2:
                System.out.println("执行case 2");
            case 3:
                System.out.println("执行case 3");
                break;
            case 4:
                System.out.println("执行case 4");
                break;
            case 5:
                System.out.println("执行case 5");
                break;
            case 6:
                System.out.println("执行case 6");
                break;
            case 7:
                System.out.println("执行case 7");
                break;
            default:
                System.out.println("没有执行case 0~7");
        }
        // 逻辑运算符
        System.out.println("您是男性还是女性？（输入M或F）");
        char ans1 = '0';
        try {
            String str = br.readLine();
            ans1 = str.charAt(0);
        } catch (IOException e) {
            // ignore
        }
        System.out.println("您帅吗？（输入Y或N）");
        char ans2 = '0';
        try {
            String str = br.readLine();
            ans2 = str.charAt(0);
        } catch (IOException e) {
            // ignore
        }
        if ((ans1 == 'M' || ans1 == 'm') && (ans2 == 'y' || ans2 == 'Y')) {
            System.out.println("您是帅男性！");
        }
        if ((ans1 == 'F' || ans1 == 'f') && (ans2 == 'y' || ans2 == 'Y')) {
            System.out.println("您是帅女性！");
        }
        // 条件运算符
        System.out.print("请输入一个整数（0或1）：");
        int num1 = 0;
        try {
            String str = br.readLine();
            num1 = Integer.parseInt(str);
        } catch (IOException e) {
            // ignore
        }
        char ch = (num1 == 0) ? 'A' : 'B';
        System.out.println("num1 = " + num1);
        System.out.println("ch = " + ch);
    }
}
