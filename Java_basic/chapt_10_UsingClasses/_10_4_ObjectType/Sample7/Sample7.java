package Java_basic.chapt_10_UsingClasses._10_4_ObjectType.Sample7;
class Car{
    private int num;
    private double gas;
    public Car(){
        num=0;
        gas=0.0;
        System.out.println("������һ����");
    }
    public void setCar(int n,double g)
    {
        num=n;
        gas=g;
        System.out.println("���ƺ���"+num+"��������Ϊ"+gas);
    }
    public void show()
    {
        System.out.println("���ƺ���"+num);
        System.out.println("��������"+gas);
    }
}
public class Sample7 {
    public static void main(String[] args) {
        Car car1;//������car1
        System.out.println("����car1");
        car1=new Car();
        car1.setCar(1324,20.5);

        Car car2;//������car2
        System.out.println("����car2");

        car2=car1;//car1�ĸ�ֵ��car2
        System.out.println("car1�ĸ�ֵ��car2");

        System.out.println("car1��ָ��");
        car1.show();
        System.out.println("car2��ָ��");
        car2.show();
        System.out.println("��ʱcar1��car2��ָ��ͬһ����������ã���ʱֻ��һ������");

        System.out.println("���car1ָ��ĳ�");
        car1.setCar(2345,30.5);

        System.out.println("car1��ָ��");
        car1.show();
        System.out.println("car2��ָ��");
        car2.show();
        System.out.println("���Կ����������޸�car1��car1��car2�����ˣ�������ͬ����car1��car2ָ�����ͬһ������");
        /*
        1-��������ֵΪnull�����������ָ�������str1=null;
        2-����������ָ��ͬһ�������ʱ��ֻ������һ��������ֵΪnull�������ǲ��ᱻ������
        3-���󱻷���ʱ�������finalize()��������ִ��str1=null;str2=null;��
         */
    }
}
