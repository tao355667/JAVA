/*
 * 10-Java类中的方法的重载
 */
package Java_basic.chapt_01_chapt_09;

class Car_10 {
    // 数据设置为私有成员：不能从类外访问
    private int num;
    private double gas;

    // 方法设置为公有成员
    public void show() {
        System.out.println("车牌号是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    public void showCar() {
        System.out.println("现在开始显示车辆信息");
        this.show();
    }

    // 1.重载函数1
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

    // 2.重载函数2
    public void setCar(double g) {
        if (g >= 0 && g <= 1000) {
            this.gas = g;
            System.out.println("汽油量改成了" + this.gas);
        } else {
            System.out.println("尝试指定错误的汽油量 " + g);
            System.out.println("无法变更汽油量!");
        }
    }

    // 3.重载函数3
    public void setCar(int n, double g) {
        setCar(n);
        setCar(g);
    }

}

public class _10_ClassOverLoading {
    public static void main(String[] args) {
        Car_10 car = new Car_10();
        System.out.println("---------初始状态-----------");
        car.show();
        System.out.println("---------第1次修改-----------");
        car.setCar(10);
        car.show();
        System.out.println("---------第2次修改-----------");
        car.setCar(568.9);
        car.show();
        System.out.println("---------第3次修改-----------");
        car.setCar(10, 1.101);
        car.show();
        System.out.println("---------第4次修改-----------");
        car.setCar(1001, 2000);
        car.show();
    }
}
