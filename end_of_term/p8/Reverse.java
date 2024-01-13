package end_of_term.p8;
/*从标准输入(即键盘)读入10个整数存入整型数组a中，然后逆序输出这10个整数。*/

import java.io.*;

public class Reverse {
    public static void main(String args[]) {
        int i, n = 10;
        int[] a = new int[10];
        for (i = 0; i < n; i++)
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                a[i] = Integer.parseInt(br.readLine());  //输入一个整数,br.readLine()返回一个String
            } catch (IOException e) {
            }
        for (i = n - 1; i >= 0; i--)
            System.out.print(a[i] + "  ");
        System.out.println();
    }
}
