/*
 * 12-Java类,static
 * 类变量(class variable):与类紧密相连的域
 * 类方法(class method):与类紧密相连的方法
 * 加static修饰符
 */
package Java_basic.chapt_01_chapt_09;

class Car_12 {
    //1 车的数量,是类变量,与对象无关
    public static int sum = 0;
    // 数据设置为私有成员：不能从类外访问
    private int num;
    private double gas;

    // 构造函数重载1
    public Car_12() {
        this.num = 0;
        this.gas = 0.0;
        sum++;//2 车数量加1
        System.out.println("创建了一辆车!");
    }

    // 构造函数重载2
    public Car_12(int num, double gas) {
        this();// 先调用一下不带参数的构造函数
        this.num = num;
        this.gas = gas;
        System.out.println("创建了一辆车牌号为 " + num + " 汽油量为 " + gas + "的车!");
    }

    //3 显示车的数量,是类方法
    public static void showSum() {
        System.out.println("车的总数为 " + sum + " 辆");
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

public class _12_ClassStatic {
    public static void main(String[] args) {

        System.out.println("---------没有车-----------");
        Car_12.showSum();
        System.out.println("---------创建1辆车-----------");
        Car_12 car1 = new Car_12();
        Car_12.showSum();
        System.out.println("---------创建10辆车-----------");
        Car_12[] carArr = new Car_12[10];
        //此时数组中没东西,没调用过构造函数
        for(int i=0;i<10;i++)
        {
            carArr[i]=new Car_12();
        }
        Car_12.showSum();

    }
}
