package Java_basic.chapt_11_NewClass._11_3_MethodOverriding.Sample5;
/*
用父类的变量处理子类的对象
结果还是子类中的show()方法被调用了
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

public class Sample5 {
    public static void main(String[] args) {
        Car car1 = new RacingCar();
        car1.setCar(1234, 20.5);

        car1.show();//仍然调用的是子类的方法
    }
}
