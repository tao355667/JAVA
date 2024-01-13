package Java_basic.chapt_10_UsingClasses._10_4_ObjectType.Sample6;
/*
P284 指定类型的变量
 */
class Car{
    private int num;
    private double gas;
    public Car(){
        num=0;
        gas=0.0;
        System.out.println("创建了一辆车");
    }
    public void setCar(int n,double g)
    {
        num=n;
        gas=g;
        System.out.println("车牌号是"+num+"，汽油量为"+gas);
    }
    public void show()
    {
        System.out.println("车牌号是"+num);
        System.out.println("汽油量是"+gas);
    }
}
public class Sample6 {
    public static void main(String[] args) {
        Car car1;//声明了car1
        System.out.println("声明car1");
        car1=new Car();
        car1.setCar(1324,20.5);

        Car car2;//声明了car2
        System.out.println("声明car2");

        car2=car1;//car1的赋值给car2
        System.out.println("car1的赋值给car2");

        System.out.println("car1所指的");
        car1.show();
        System.out.println("car2所指的");
        car2.show();
        System.out.println("此时car1和car2是指向同一个对象的引用，此时只有一个对象");
    }
}
