package end_of_term.p8;

//import java.util.Scanner;
import java.util.*;
public class ReverseArray {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        // ���ζ���10������������a��
        for (int i = 0; i < a.length; i++) {
//            System.out.print("�������" + (i+1) + "��������");
            a[i] = sc.nextInt();
        }
        sc.close();
        // �����������a�е�Ԫ��
        System.out.print("�����������a��Ԫ�أ�");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
