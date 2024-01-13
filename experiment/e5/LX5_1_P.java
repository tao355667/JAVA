package experiment;

public class LX5_1_P
{
    protected String xm; //具有保护修饰符的成员变量
    protected int xh;
    void setdata(String m,int h) //设置数据的方法
    {
        xm =m;
        xh = h;
    }
    public void print() //输出数据的方法
    {
        System.out.println(xm+", "+xh);
    }
}

