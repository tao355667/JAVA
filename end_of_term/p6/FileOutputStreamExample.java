package end_of_term.p6;
/*ʹ��FileOutputStream��write()�������û��Ӽ���������ַ������浽�ļ���*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // ����һ���Ӽ��̽������ݵ�ɨ����
        Scanner scanner = new Scanner(System.in);
        // �����ļ��ֽ������
        FileOutputStream fos = null;
        try {
            // ʵ�����ļ��ֽ������
            fos = new FileOutputStream("D:\\data\\xsc.txt");
            System.out.println("���������ݣ�");
            String str = scanner.nextLine();
            // ������д���ļ���
            fos.write(str.getBytes());
            System.out.println("�ѱ��棡");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // �ر��ļ������
                fos.close();
                scanner.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
