package Java_basic.chapt_10_UsingClasses._10_3_OtherClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
P282 查询最大值
 */
public class Sample5 {
    public static void main(String[] args) throws IOException {
        System.out.println("输入两个整数（以回车作为分割）");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int ans = Math.max(num1, num2);
        System.out.println(num1 + "和" + num2 + "中" + ans + "更大");
        System.out.println("生成一个1~6的随机数：" + ((int) (Math.random() * 6) + 1));
    }
}
