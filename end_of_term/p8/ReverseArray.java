package end_of_term.p8;

//import java.util.Scanner;
import java.util.*;
public class ReverseArray {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        // 依次读入10个整数到数组a中
        for (int i = 0; i < a.length; i++) {
//            System.out.print("请输入第" + (i+1) + "个整数：");
            a[i] = sc.nextInt();
        }
        sc.close();
        // 逆序输出数组a中的元素
        System.out.print("逆序输出数组a的元素：");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
