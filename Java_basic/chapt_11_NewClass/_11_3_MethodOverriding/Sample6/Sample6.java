package Java_basic.chapt_11_NewClass._11_3_MethodOverriding.Sample6;

/*
方法重写的应用
可使用父类数组，其中的引用可以指向父类也可指向子类，
对子类对象而言，show()调用了子类中的show()方法
对父类对象而言，show()调用了父类中的show()方法
从而实使程序的书写更方便
补充1：
    this可访问本类中的成员和方法
    super可访问父类中的成员和方法
补充2：
    final的作用：表示”不可变“
    eg1：类前加final表示该类不可被继承
    fg2：方法前加final表示该方法无法被重写
 */
class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("创建了一辆车");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("车牌号为" + num + "，汽油量为" + gas);
    }

    public void show() {//该方法会被重写
        System.out.println("车牌号是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car {
    private int course;//路线号

    public RacingCar() {
        course = 0;
        System.out.println("已创建赛车");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("路线号设置为" + course);
    }

    public void show() {//方法重写
        System.out.println("赛车的车牌号是" + num);
        System.out.println("赛车的汽油量是" + gas);
        System.out.println("赛车的路线号是" + course);
    }
}

public class Sample6 {
    public static void main(String[] args) {
        Car[] cars;
        cars =new Car[2];

        cars[0]=new Car();//这个调用的是父类的show()方法
        cars[0].setCar(1234,20.5);

        cars[1]=new RacingCar();//这个调用的是子类的show()方法
        cars[1].setCar(4567,30.5);

        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}
