package experiment;

class LX5_2 extends LX5_1_P{
    protected String xy;
    protected String xi;
    public static void main(String args[])
    {
        LX5_1_P p1 = new LX5_1_P();
        p1.setdata("˧��",12321) ;
        p1.print();
        LX5_2 s1 = new LX5_2() ;
        s1.setdata("������",12345); //���ø���ĳ�Ա����
        s1.xy="���ù���ѧԺ"; //���ʱ���ĳ�Ա����
        s1.xi="��Ϣ����ϵ"; //���ʱ���ĳ�Ա����
        s1.print();
        System.out.print(s1.xm+", "+s1.xy+", "+s1.xi);
    }
}
