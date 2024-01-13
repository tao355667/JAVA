/*
 * 9-Java类中的成员
 * 主要是成员的访问
 */
package Java_basic.chapt_01_chapt_09;

//对类进行修改
class Car_09 {
    // 1.数据设置为私有成员：不能从类外访问
    private int num;
    private double gas;

    // 2.方法设置为公有成员
    public void show() {
        System.out.println("车牌号是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    public void showCar() {
        System.out.println("现在开始显示车辆信息");
        this.show();
    }

    // 3.通过方法修改数据成员
    public void setNum(int n) {
        //3.1 对输入值进行判断,避免出现错误值
        if (n >= 0 && n <= 1000) {
            this.num = n;
            System.out.println("车牌号改成了" + this.num);
        } else {
            System.out.println("尝试指定错误的车牌号 " + n);
            System.out.println("无法变更车牌号!");
        }


    }

    public void setGas(double g) {
        if (g >= 0 && g <= 1000) {
            this.gas = g;
            System.out.println("汽油量改成了" + this.gas);
        } else {
            System.out.println("尝试指定错误的汽油量 " + g);
            System.out.println("无法变更汽油量!");
        }
    }

    //3.2 嵌套调用方法
    public void setNumGas(int n, double g) {
        setNum(n);
        setGas(g);
    }

}

public class _09_ClassMember {
    public static void main(String[] args) {
        Car_09 car = new Car_09();
        System.out.println("---------初始状态-----------");
        car.show();
        System.out.println("---------第1次修改-----------");
        car.setNumGas(10, 1.101);
        car.show();
        System.out.println("---------第2次修改-----------");
        car.setNumGas(1001, 2000);
        car.show();
    }
}
