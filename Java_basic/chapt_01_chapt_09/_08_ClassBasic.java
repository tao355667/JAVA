/*
 * 8-Java类与对象
 */
package Java_basic.chapt_01_chapt_09;

//1.定义类
class Car_08 {
    // 数据
    int num;
    double gas;

    // 方法
    void show() {
        System.out.println("车牌号是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    void showCar_08() {
        System.out.println("现在开始显示车辆信息");
        this.show();
    }

    // 通过方法修改数据成员
    void setNum(int n) {
        this.num = n;
        System.out.println("车牌号改成了" + this.num);
    }

    void setGas(double g) {
        this.gas = g;
        System.out.println("汽油量改成了" + this.gas);
    }

    void setNumGas(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("车牌号改成了" + this.num);
        System.out.println("汽油量改成了" + this.gas);
    }

}

public class _08_ClassBasic {
    public static void main(String[] args) {
        // 2.创建对象
        System.out.println("---------2.创建对象-----------");
        Car_08 Car_081;
        Car_081 = new Car_08();
        Car_08 Car_082 = new Car_08();
        // 3.对象赋值
        System.out.println("---------3.对象赋值-----------");
        Car_081.num = 1234;
        Car_081.gas = 20.5;
        Car_082.num = 2;
        Car_082.gas = 22.2;
        // 4.调用方法
        System.out.println("---------4.调用方法显示信息-----------");
        Car_081.show();
        Car_082.show();
        Car_081.showCar_08();
        Car_082.showCar_08();
        // 5.通过方法修改数据成员
        System.out.println("---------5.通过方法修改数据成员-----------");
        Car_081.setGas(66.6);
        Car_081.setNum(1145);
        Car_082.setNumGas(333, 99.99);
        Car_081.showCar_08();
        Car_082.showCar_08();
    }
}
