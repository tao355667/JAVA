package Java_basic.chapt_10_UsingClasses._10_5_ObjectArray;
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
        System.out.println("���ƺ�Ϊ"+num+"��������Ϊ"+gas);
    }
    public void show()
    {
        System.out.println("���ƺ���"+num);
        System.out.println("��������"+gas);
    }

}
public class Sample9 {
    public static void main(String[] args) {
        Car[] cars;
        cars=new Car[3];
        for (int i=0;i<cars.length;i++)
        {
            cars[i]=new Car();
        }
        cars[0].setCar(1234,20.5);
        cars[1].setCar(2345,30.5);
        cars[2].setCar(3456,40.5);
        for (int i = 0; i < cars.length; i++) {
                cars[i].show();
        }
    }
}
