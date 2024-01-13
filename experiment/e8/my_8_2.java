package experiment.e8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class my_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "address.txt"; // 文件名

        try {
            FileWriter fw = new FileWriter(fileName);
            System.out.println("请依次输入姓名和住址，输入 quit 结束输入：");

            while (true) {
                System.out.print("姓名：");
                String name = sc.nextLine();
                if (name.equals("quit")) {
                    break;
                }
                System.out.print("住址：");
                String address = sc.nextLine();

                String line = "姓名：" + name + "，住址：" + address + "\n";
                fw.write(line);
            }

            fw.close();
            System.out.println("已将用户输入保存到文件 " + fileName + " 中。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close(); // 记得关闭输入流
        }
    }
}
