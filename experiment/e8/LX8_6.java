package experiment.e8;

import java.io.*;
public class LX8_6{
    public static void main(String arg[]){
        try{  //��ӷ�ʽ�����ļ������
            FileOutputStream fout = new FileOutputStream("D:\\code\\JAVA\\experiment\\e8\\LX8_6.txt",true);
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(1);
            dout.writeChars("����"+"\n");
            dout.writeInt(2);
            dout.writeChars("����"+"\n");
            dout.close();
        }catch (IOException ioe){}
        try{
            FileInputStream fin = new FileInputStream("D:\\code\\JAVA\\experiment\\e8\\LX8_6.txt");
            DataInputStream din = new DataInputStream(fin);
            int i = din.readInt();
            while (i!=-1) {//������δ����ʱ������������ʱi Ϊ-1
                System.out.print(i+" ");
                char ch ;
                while ((ch=din.readChar())!='\n') //�ַ���δ����ʱ
                    System.out.print(ch);
                System.out.println();
                i = din.readInt();
            }
            din.close();
        }catch (IOException ioe){}
    }
}

