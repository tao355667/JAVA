package end_of_term.p6;
/*使用FileOutputStream的write()方法将用户从键盘输入的字符串保存到文件中*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // 建立一个从键盘接收数据的扫描器
        Scanner scanner = new Scanner(System.in);
        // 声明文件字节输出流
        FileOutputStream fos = null;
        try {
            // 实例化文件字节输出流
            fos = new FileOutputStream("D:\\data\\xsc.txt");
            System.out.println("请输入内容：");
            String str = scanner.nextLine();
            // 将数据写入文件中
            fos.write(str.getBytes());
            System.out.println("已保存！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭文件输出流
                fos.close();
                scanner.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
