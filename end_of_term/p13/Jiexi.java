package end_of_term.p13;
/*
ʹ��Scanner���ʵ�������ַ�����"��ѧ87�֣�����76�֣�Ӣ��96��"�еĿ��Գɼ�����������ܳɼ��Լ�ƽ������
*/

import java.util.*;

public class Jiexi {
    public static void main(String args[]) {
        String cost = " ��ѧ 87 �֣����� 76 �֣�Ӣ�� 96 ��";
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+");//���÷ָ���
        double sum = 0;
        int count = 0;
        while (scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                count++;//�����ɼ�
                sum = sum + score;//�ܳɼ�
                System.out.println(score);
            } catch (InputMismatchException exp) {
                String t = scanner.next();
            }
        }
        System.out.println(" �ܷ� :" + sum + " ��");
        System.out.println(" ƽ���� :" + sum / count + " ��");
    }
}
