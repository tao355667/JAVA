/*
 * 2-Java基本数据类型
 */
package Java_basic.chapt_01_chapt_09;

public class _02_DataType {
    public static void main(String[] args) {
        // 大范围数不能赋值给小范围的，如double不能赋值给int
        boolean boo = true;
        char ch = 'a'; // 布尔型
        byte by = 32; // 字节型，-128~127
        short sh = 66; // 短整型，2个字节，-32768~32767
        int i = 44; // 整型，4个字节，-2147483648~2147483647
        long lo = 9; // 长整型，8个字节，-9223372036854775808~9223372036854775807
        float flo = 4; // 4字节
        double dou = 5.6; // 8字节
        System.out.println(boo);
        System.out.println(ch);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(lo);
        System.out.println(flo);
        System.out.println(dou);
    }
}
