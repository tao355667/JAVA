package Java_basic.chapt_11_NewClass._11_2_MemberAccess;
/*
设父类成员a是private，则在子类中无法访问a
将a设置为protected，就可在子类中访问了
 */

/*
建立车类，建立赛车类（继承车类）
 */
//Car类
class Car {
    protected int num;//车牌号
    protected double gas;//汽油量

    public Car() {
        num = 0;
        gas = 0;
        System.out.println("创建了一辆车");
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

    public void setCourse(int c) {
        course = c;
        System.out.println("路线号设置为" + course);
    }

    public void newShow() {
        System.out.println("赛车的车牌号是" + num);
        System.out.println("赛车的汽油量是" + gas);
        System.out.println("赛车的路线号是" + course);
    }
}

public class Sample3 {
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar();
        rccar1.newShow();
    }
}
