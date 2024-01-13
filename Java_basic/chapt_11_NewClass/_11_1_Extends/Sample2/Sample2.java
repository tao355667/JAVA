package Java_basic.chapt_11_NewClass._11_1_Extends.Sample2;

/*
建立车类，建立赛车类（继承车类）
 */
//Car类
class Car {
    private int num;//车牌号
    private double gas;//汽油量

    public Car() {
        num = 0;
        gas = 0;
        System.out.println("创建了一辆车");
    }

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("车牌号为" + num + "汽油量为" + gas + "的车已经创建好了");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("车牌号为" + num + "，汽油量为" + gas);
    }

    public void show() {
        System.out.println("车牌号是" + num);
        System.out.println("汽油量是" + gas);
    }
}

//RacingCar类
class RacingCar extends Car {
    private int course;//路线号

    public RacingCar() {
        course = 0;
        System.out.println("已创建赛车");
    }

    public RacingCar(int n, double g, int c) {
        super(n, g);
        course = c;
        System.out.println("已创建赛车的路线号为" + course);
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("路线号设置为" + course);
    }
}

public class Sample2 {
    /*
    用super调用指定构造函数
    一些解释：
    this():调用这个类的其他构造函数
    super():调用这个类的父类的构造函数
    可将不同类型或数量的参数传入函数，以调用不同的构造函数（重载）
     */
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar(1234, 20.5, 5);

    }
}

