package experiment.e8;

import java.io.*;
class LX8_5 {
    public static void main(String args[]) {
        String str[]={"First line\n","Second line\n","Last line\n"};
        try {
            RandomAccessFile rf=new RandomAccessFile("D:\\code\\JAVA\\experiment\\e8\\LX8_5.txt", "rw");
            System.out.println("\n �ļ�ָ��λ��Ϊ��"+rf.getFilePointer());
            System.out.println("�ļ��ĳ���Ϊ��"+rf.length());
            rf.seek(rf.length());
            System.out.println("�ļ�ָ�����ڵ�λ��Ϊ��"+rf.getFilePointer());
            for (int i=0; i<3; i++)
                rf.writeChars(str[i]); // �ַ���תΪ�ֽڴ���ӵ��ļ�ĩβ
            rf.seek(10);
            System.out.println("\n ѡ����ʾ���ļ����ݣ�");
            String s;
            while ((s=rf.readLine())!=null)
                System.out.println(s);
            rf.close();
        }catch (FileNotFoundException fnoe) {}
        catch (IOException ioe) {}
    }
}
