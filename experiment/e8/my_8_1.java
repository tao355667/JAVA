package experiment.e8;

import java.util.Scanner;

public class my_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ�������� n��");
        int n = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(n + "! = " + result);
        sc.close(); // �ǵùر�������
    }
}
