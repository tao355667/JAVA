package Java_basic.chapt_10_UsingClasses._10_2_StringClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
P276 �����ַ�
 */
public class Sample3 {
    public static void main(String[] args) throws IOException {
        System.out.println("�������ַ���");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();

        System.out.println("����������ַ�");
        String str2=br.readLine();
        char ch=str2.charAt(0);
        //���ַ�
        int num=str1.indexOf(ch);
        if(num!=-1)
            System.out.println("��"+str1+"�еĵ�"+(num+1)+"���ַ��ҵ���"+ch+"��");
        else
            System.out.println("��"+str1+"û���ҵ��ַ�"+ch+"��");
    }
}
