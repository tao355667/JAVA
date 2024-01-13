package experiment.e8;

import java.io.*;

public class LX8_4 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("D:\\code\\JAVA\\experiment\\e8\\LX8_1.HTML");//建立文件输入流
        BufferedReader bin = new BufferedReader(in);//建立缓冲输入流
        FileWriter out = new FileWriter("D:\\code\\JAVA\\experiment\\e8\\LX8_1.txt", true);//建立文件输出流
        String str;
        while ((str = bin.readLine()) != null) {//将缓冲区内容通过循环方式逐行赋值给字符串str
            System.out.println(str);//在屏幕上显示字符串str
            out.write(str + "\n");//将字符串str 通过输出流写入LX8_1.txt 中
        }
        in.close();
        out.close();
    }
}
