package experiment;

class LX5_2 extends LX5_1_P{
    protected String xy;
    protected String xi;
    public static void main(String args[])
    {
        LX5_1_P p1 = new LX5_1_P();
        p1.setdata("帅零",12321) ;
        p1.print();
        LX5_2 s1 = new LX5_2() ;
        s1.setdata("郭丽娜",12345); //调用父类的成员方法
        s1.xy="经济管理学院"; //访问本类的成员变量
        s1.xi="信息管理系"; //访问本类的成员变量
        s1.print();
        System.out.print(s1.xm+", "+s1.xy+", "+s1.xi);
    }
}
