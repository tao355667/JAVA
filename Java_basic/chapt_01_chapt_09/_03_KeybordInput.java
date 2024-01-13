/*
 * 3-Java键盘输入
 */
package Java_basic.chapt_01_chapt_09;

import java.io.*;//库

public class _03_KeybordInput {
    public static void main(String[] args) {
        // 流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 调用流对象的方法，将读取的值赋给str
        String str = "INI";
        try {
            str = br.readLine();
        } catch (IOException e) {
            // ignore,忽略异常
        }
        // 将str转换为数字
        int num = Integer.parseInt(str);
        // 输出一些结果
        System.out.println("str=" + str);
        System.out.println("num=" + num);
        // 输入多个数值,计算
        String str1 = "str1";
        String str2 = "str2";
        try {
            str1 = br.readLine();
        } catch (IOException e) {
            // ignore,忽略异常
        }
        try {
            str2 = br.readLine();
        } catch (IOException e) {
            // ignore,忽略异常
        }
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = num1 + num2;
        // 输出一些结果
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
        System.out.println("num1+num2=" + num3);
    }
}
