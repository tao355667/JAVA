package end_of_term.p7;
/*
编写一个Application程序实现如下功能：接受命令行中给出的一个字符串，
先将该串原样输出，然后判断该串的第一个字母是否为大写，若是大写则统计该串中大写字母的个数，
并将所有大写字母输出；否则，输出信息串“第一个字母不是大写字母!”。
*/
public class StringOp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char ch;
        int i = 0;
        String str = args[0];

        System.out.println(str);
        while (i < str.length()) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                System.out.print("  " + ch);
            else if (i == 0) {
                System.out.println("第一个字母不是大写字母");
                return;
            }
            i++;
        }
    }

}
