package Java_basic.chapt_10_UsingClasses._10_2_StringClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
P275 ת��Ϊ��д��Сд��ĸ
 */
public class Sample2 {
    public static void main(String[] args)throws IOException {
        System.out.println("������Ӣ����ĸ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String stru=str.toUpperCase();//���ַ���ת��Ϊ��д��ĸ
        String strl=str.toLowerCase();//���ַ���ת��ΪСд��ĸ
        System.out.println("ת��Ϊ��д��ĸ�ǣ�"+stru);
        System.out.println("ת��ΪСд��ĸ�ǣ�"+strl);
    }
}
