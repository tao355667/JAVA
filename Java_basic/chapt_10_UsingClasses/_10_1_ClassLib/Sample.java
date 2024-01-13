package Java_basic.chapt_10_UsingClasses._10_1_ClassLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
使用类库中的类及其功能，可方便地实现某些程序功能，简化开发流程。

br：BufferedReader的变量
str：String的变量

br.readLine;：调用了BufferedReader类的方法
Integer.parseInt(str);：调用了Integer类的方法
 */
public class Sample {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个整数：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        int num=Integer.parseInt(str);
        System.out.println("刚才输入的是："+num);
    }
}
