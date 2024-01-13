package experiment.e8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class my_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "address.txt"; // �ļ���

        try {
            FileWriter fw = new FileWriter(fileName);
            System.out.println("����������������סַ������ quit �������룺");

            while (true) {
                System.out.print("������");
                String name = sc.nextLine();
                if (name.equals("quit")) {
                    break;
                }
                System.out.print("סַ��");
                String address = sc.nextLine();

                String line = "������" + name + "��סַ��" + address + "\n";
                fw.write(line);
            }

            fw.close();
            System.out.println("�ѽ��û����뱣�浽�ļ� " + fileName + " �С�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close(); // �ǵùر�������
        }
    }
}
