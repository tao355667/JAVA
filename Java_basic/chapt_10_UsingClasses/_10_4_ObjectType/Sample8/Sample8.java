package Java_basic.chapt_10_UsingClasses._10_4_ObjectType.Sample8;

/*
P291 在参数中使用类型变量
 */
class Car {
    private int num;//使用了基本类型变量的域
    private double gas;
    private String name;//使用了类型变量的域

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("创建了一辆车");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("车牌号是" + num + "，汽油量为" + gas);
    }

    public void setName(String name) {//将类型的变量作为限定参数的方法
        this.name = name;
        System.out.println("名称设定为" + name);
    }

    public void show() {
        System.out.println("车牌号是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("名称是" + name);
    }
}

public class Sample8 {
    public static void main(String[] args) {
        Car car1;//声明了car1
        car1 = new Car();
        car1.show();

        int number=1234;
        double gasoline=20.5;
        String str="1号车";

        car1.setCar(number,gasoline);
        car1.setName(str);//将指向字符串对象的变量作为实际参数来指定

        car1.show();
    }
}
