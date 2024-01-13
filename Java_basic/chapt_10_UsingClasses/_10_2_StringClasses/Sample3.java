package Java_basic.chapt_10_UsingClasses._10_2_StringClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
P276 检索字符
 */
public class Sample3 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入字符串");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();

        System.out.println("请输入检索字符");
        String str2=br.readLine();
        char ch=str2.charAt(0);
        //找字符
        int num=str1.indexOf(ch);
        if(num!=-1)
            System.out.println("在"+str1+"中的第"+(num+1)+"个字符找到了"+ch+"。");
        else
            System.out.println("在"+str1+"没有找到字符"+ch+"。");
    }
}
