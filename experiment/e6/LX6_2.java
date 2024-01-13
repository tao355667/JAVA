package experiment.e6;
import experiment.e6. LX6_1_YMD; //引用experiment.e6 包中的 LX6_1_YMD 类
public class  LX6_2
{
    private String name;
    private  LX6_1_YMD birth;
    public static void main(String args[])
    {
        LX6_2 a = new  LX6_2("张驰",1990,1,11);
        a.output();
    }
    public  LX6_2(String n1, LX6_1_YMD d1)
    {
        name = n1;
        birth = d1;
    }
    public  LX6_2(String n1,int y,int m,int d)
    {
        this(n1,new  LX6_1_YMD(y,m,d));//初始化变量与对象
    }
    public int age() //计算年龄
    {
        return  LX6_1_YMD.thisyear() - birth.year(); //返回当前年与出生年的差即年龄
    }
    public void output()
    {
        System.out.println("姓名 : "+name);
        System.out.println("出生日期: "+birth.toString());
        System.out.println("今年年龄 : "+age());
    }
}
