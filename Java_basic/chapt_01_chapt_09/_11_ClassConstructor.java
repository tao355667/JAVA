/*
 * 11-Java类,构造函数
 * 注:在 JAVA 语言中，并没有提供像 C++、Python 等语言提供的默认参数特性，必须通过函数重载实现。
 */
package Java_basic.chapt_01_chapt_09;

class Car_11 {
    // 数据设置为私有成员：不能从类外访问
    private int num;
    private double gas;
    //1 构造函数重载1
    public Car_11()
    {
        this.num=0;
        this.gas=0.0;
        System.out.println("创建了一辆车!");
    }
    //2 构造函数重载2
    public Car_11(int num,double gas)
    {
        this();//3 先调用一下不带参数的构造函数
        this.num=num;
        this.gas=gas;
        System.out.println("创建了一辆车牌号为 "+num+" 汽油量为 "+gas+"的车!");
    }
    // 方法设置为公有成员
    public void show() {
        System.out.println("车牌号是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    public void showCar() {
        System.out.println("现在开始显示车辆信息");
        this.show();
    }


    public void setCar(int n) {
        // 对输入值进行判断,避免出现错误值
        if (n >= 0 && n <= 1000) {
            this.num = n;
            System.out.println("车牌号改成了" + this.num);
        } else {
            System.out.println("尝试指定错误的车牌号 " + n);
            System.out.println("无法变更车牌号!");
        }


    }


    public void setCar(double g) {
        if (g >= 0 && g <= 1000) {
            this.gas = g;
            System.out.println("汽油量改成了" + this.gas);
        } else {
            System.out.println("尝试指定错误的汽油量 " + g);
            System.out.println("无法变更汽油量!");
        }
    }


    public void setCar(int n, double g) {
        setCar(n);
        setCar(g);
    }

}

public class _11_ClassConstructor {
    public static void main(String[] args) {
        System.out.println("---------第1辆车:调用不带参数的构造函数-----------");
        Car_11 car1 = new Car_11();
        car1.show();
        System.out.println("---------第2辆车:调用带参数的构造函数-----------");
        Car_11 car2 = new Car_11(22,22.2);
        car2.show();
    }
}
