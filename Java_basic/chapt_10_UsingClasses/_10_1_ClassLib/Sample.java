package Java_basic.chapt_10_UsingClasses._10_1_ClassLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
ʹ������е��༰�书�ܣ��ɷ����ʵ��ĳЩ�����ܣ��򻯿������̡�

br��BufferedReader�ı���
str��String�ı���

br.readLine;��������BufferedReader��ķ���
Integer.parseInt(str);��������Integer��ķ���
 */
public class Sample {
    public static void main(String[] args) throws IOException {
        System.out.println("������һ��������");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        int num=Integer.parseInt(str);
        System.out.println("�ղ�������ǣ�"+num);
    }
}
