package Java_basic.chapt_10_UsingClasses._10_2_StringClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
P278 ����ַ���
 */
public class Sample4 {
    public static void main(String[] args) throws IOException {
        System.out.println("�������ַ���");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();

        System.out.println("������Ҫ��ӵ��ַ���");
        String str2=br.readLine();
        StringBuffer sb=new StringBuffer(str1);
        sb.append(str2);
        System.out.println("�� "+str1+" ����� "+str2+" �� "+sb);
    }
}
