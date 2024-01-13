/*
 * 4-Java操作符
 * 操作符：operator
 * 操作对象：operand
 * 四则运算:左结合
 * 赋值运算:右结合
 */
package Java_basic.chapt_01_chapt_09;

public class _04_Expression {
    public static void main(String[] args) {
        System.out.println("5+6=" + (5 + 6));
        System.out.println("5/6=" + (5 / 6) + "整数间除法默认向下取整");
        int a = 0;
        System.out.println("a++=" + a++);
        System.out.println("a++=" + a++);
        System.out.println("a++=" + a++);
        System.out.println("a++=" + (a * 2 + 5));
        System.out.println("a * (2 + 5)=" + (a * (2 + 5)));
        System.out.println("a=" + a);
        System.out.println("(a = a * 2 + 5) =" + (a = a * 2 + 5));
        System.out.println("a=" + a);
        // 数据类型转换
        int intnum = 5;
        double dounum = intnum;// 小的数据类型可以赋值给大的类型
        System.out.println("intnum=" + intnum);
        System.out.println("dounum=" + dounum);
        // double dounum1 = 5.5;// 大的数据类型不可以赋值给小的类型
        // int intnum1=dounum1;// 报错:Type mismatch: cannot convert from double to int
        // 不同数据类型间的计算:会把小的转成大的
        int d = 2;
        double pi = 3.14;
        System.out.println("直径是" + d + "cm的圆。");
        System.out.println("周长是" + (pi * d) + "cm。");
        System.out.println("面积是" + (pi * d * d / 4) + "cm。");
        // 强制类型转换符
        double dounum2 = 9.9;
        System.out.println("dounum2 = " + dounum2);
        System.out.println("(int)dounum2 = " + (int) dounum2);

    }

}
