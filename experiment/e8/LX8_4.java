package experiment.e8;

import java.io.*;

public class LX8_4 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("D:\\code\\JAVA\\experiment\\e8\\LX8_1.HTML");//�����ļ�������
        BufferedReader bin = new BufferedReader(in);//��������������
        FileWriter out = new FileWriter("D:\\code\\JAVA\\experiment\\e8\\LX8_1.txt", true);//�����ļ������
        String str;
        while ((str = bin.readLine()) != null) {//������������ͨ��ѭ����ʽ���и�ֵ���ַ���str
            System.out.println(str);//����Ļ����ʾ�ַ���str
            out.write(str + "\n");//���ַ���str ͨ�������д��LX8_1.txt ��
        }
        in.close();
        out.close();
    }
}
