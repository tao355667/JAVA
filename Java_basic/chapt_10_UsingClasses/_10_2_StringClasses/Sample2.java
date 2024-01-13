package Java_basic.chapt_10_UsingClasses._10_2_StringClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
P275 转换为大写、小写字母
 */
public class Sample2 {
    public static void main(String[] args)throws IOException {
        System.out.println("请输入英文字母");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String stru=str.toUpperCase();//将字符串转换为大写字母
        String strl=str.toLowerCase();//将字符串转换为小写字母
        System.out.println("转换为大写字母是："+stru);
        System.out.println("转换为小写字母是："+strl);
    }
}
