package experiment.e6;
import experiment.e6. LX6_1_YMD; //����experiment.e6 ���е� LX6_1_YMD ��
public class  LX6_2
{
    private String name;
    private  LX6_1_YMD birth;
    public static void main(String args[])
    {
        LX6_2 a = new  LX6_2("�ų�",1990,1,11);
        a.output();
    }
    public  LX6_2(String n1, LX6_1_YMD d1)
    {
        name = n1;
        birth = d1;
    }
    public  LX6_2(String n1,int y,int m,int d)
    {
        this(n1,new  LX6_1_YMD(y,m,d));//��ʼ�����������
    }
    public int age() //��������
    {
        return  LX6_1_YMD.thisyear() - birth.year(); //���ص�ǰ���������Ĳ����
    }
    public void output()
    {
        System.out.println("���� : "+name);
        System.out.println("��������: "+birth.toString());
        System.out.println("�������� : "+age());
    }
}
