package Java_basic.chapt_10_UsingClasses._10_2_StringClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
P278 添加字符串
 */
public class Sample4 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入字符串");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();

        System.out.println("请输入要添加的字符串");
        String str2=br.readLine();
        StringBuffer sb=new StringBuffer(str1);
        sb.append(str2);
        System.out.println("在 "+str1+" 中添加 "+str2+" 是 "+sb);
    }
}
