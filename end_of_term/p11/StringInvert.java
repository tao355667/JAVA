package end_of_term.p11;
/*��дһ��Ӧ�ó��򣬽����û������һ���ַ�����ͳ���ַ�������Ȼ���������*/
import java.util.Scanner;

public class StringInvert {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count;
        String str, str1 = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ���ַ���");
        str = sc.next();//�ո�/�س�����
        count = str.length();
        System.out.println("str�ĳ���Ϊ" + count);
        for (int i = 0; i < str.length(); i++)
            str1 = str.charAt(i) + str1;
        System.out.println("������ַ���Ϊ" + str1);
    }

}
