package experiment.e8;

import java.io.*;
class LX8_5 {
    public static void main(String args[]) {
        String str[]={"First line\n","Second line\n","Last line\n"};
        try {
            RandomAccessFile rf=new RandomAccessFile("D:\\code\\JAVA\\experiment\\e8\\LX8_5.txt", "rw");
            System.out.println("\n 文件指针位置为："+rf.getFilePointer());
            System.out.println("文件的长度为："+rf.length());
            rf.seek(rf.length());
            System.out.println("文件指针现在的位置为："+rf.getFilePointer());
            for (int i=0; i<3; i++)
                rf.writeChars(str[i]); // 字符串转为字节串添加到文件末尾
            rf.seek(10);
            System.out.println("\n 选择显示的文件内容：");
            String s;
            while ((s=rf.readLine())!=null)
                System.out.println(s);
            rf.close();
        }catch (FileNotFoundException fnoe) {}
        catch (IOException ioe) {}
    }
}
