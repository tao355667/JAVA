package end_of_term.p9;
/*
��ŵ������
�������������Ӻ�һ��ֱ��������ͬ�Ŀ���Բ�̣���ʼʱԴ�����ϵ�����Բ�̶����Ӵ�С��˳�����С�
Ŀ����ͨ��ÿһ���ƶ�һ��Բ�̵���һ�������ϣ����հ�һ��Բ���ƶ���Ŀ�������ϣ�
�����в�����ѽϴ��Բ�̷����ڽ�С��Բ���ϣ�
*/
public class J_Hanoi {
    public static void mb_hanoi(int n, char start, char temp, char end)
    {
        if (n<=1)
            System.out.println("���̴�" + start + "�Ƶ�" + end);
        else
        {
            mb_hanoi(n-1, start, end, temp);
            System.out.println("���̴�" + start + "�Ƶ�" + end);
            mb_hanoi(n-1, temp, start, end);
        } // if-else�ṹ����
    } // ����mb_hanoi����

    public static void main(String args[ ])
    {
        mb_hanoi(3, 'S', 'T', 'E');
    }
}
