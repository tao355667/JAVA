package end_of_term.p7;
/*
��дһ��Application����ʵ�����¹��ܣ������������и�����һ���ַ�����
�Ƚ��ô�ԭ�������Ȼ���жϸô��ĵ�һ����ĸ�Ƿ�Ϊ��д�����Ǵ�д��ͳ�Ƹô��д�д��ĸ�ĸ�����
�������д�д��ĸ��������������Ϣ������һ����ĸ���Ǵ�д��ĸ!����
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
                System.out.println("��һ����ĸ���Ǵ�д��ĸ");
                return;
            }
            i++;
        }
    }

}
