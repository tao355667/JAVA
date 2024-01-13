package end_of_term.p11;
/*编写一个应用程序，接受用户输入的一行字符串，统计字符个数，然后反序输出。*/
import java.util.Scanner;

public class StringInvert {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count;
        String str, str1 = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        str = sc.next();//空格/回车结束
        count = str.length();
        System.out.println("str的长度为" + count);
        for (int i = 0; i < str.length(); i++)
            str1 = str.charAt(i) + str1;
        System.out.println("逆序后字符串为" + str1);
    }

}
