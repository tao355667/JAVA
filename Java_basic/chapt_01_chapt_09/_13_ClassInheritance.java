/*
 * 13-Java类,继承
 * 1
 * 类扩张（extends）:就是继承，java只能单继承
 * 2
 * this()与super()
 * this():调用该类的其他构造函数
 * super():调用父类的构造函数
 * 注：
 * 这两个函数都必须在类构造函数的开头调用
 * 不能在同一个构造函数中使用
 * 可用参数确定要调用的是哪个构造函数（重载）
 * 不指定父类构造函数，则默认调用不带参数的构造函数
 * 3
 * 父类中protected成员可在子类中被存取
 * 4
 * 用父类变量处理子类的对象，可用数组批量处理对象
 * 5
 * this.与super.
 * this.:可调用该类的成员
 * super.:可调用父类的成员
 * 6
 * final可防止方法被重写，例子如下：
 * public final void show(){}
 * 7
 * Java中无父类的类，它们都有一个父类Object类，一般要求对它们进行重写
 * Object类的一些方法：
 * toString()//将对象转换为字符串
 * equals()//查询对象是否”相同“
 * getClass()//查询对象所属的类
 */
package Java_basic.chapt_01_chapt_09;

class Car_12_1 {
    // 车的数量,是类变量,与对象无关
    static int sum = 0;
    // 数据设置为私有成员：不能从类外访问
    protected int num;
    protected double gas;

    // 构造函数重载1
    public Car_12_1() {
        this.num = 0;
        this.gas = 0.0;
        sum++;//2 车数量加1
        System.out.println("创建了一辆车!");
    }

    // 构造函数重载2
    public Car_12_1(int num, double gas) {
        this();// 先调用一下不带参数的构造函数
        this.num = num;
        this.gas = gas;
        System.out.println("创建了一辆车牌号为 " + num + " 汽油量为 " + gas + "的车!");
    }

    // 显示车的数量,是类方法
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

//RacingCar类
class RacingCar extends Car_12_1 {
    private int course;

    public RacingCar() {//构造函数
        course = 0;
        System.out.println("已创建赛车");
    }

    public RacingCar(int n, double g, int c) {//构造函数
        super(n, g);
        course = c;
        System.out.println("已创建赛车的路线号是 " + course);
    }

    public void setCourse(int c) {//追加的方法
        course = c;
        System.out.println("路线号设置为" + course);
    }

    public void newShow() {
        System.out.println("赛车的车牌号是 " + num);
        System.out.println("赛车的汽油量是 " + gas);
        System.out.println("赛车的路线号是 " + course);
    }

    public void show() {
        System.out.println("赛车的车牌号是 " + num);
        System.out.println("赛车的汽油量是 " + gas);
        System.out.println("赛车的路线号是 " + course);
    }

    public String toString() {
        String str = "赛车的车牌号是 " + num + " , 汽油量是" + gas+" , 路线号是"+course;
        return str;
    }
}


public class _13_ClassInheritance {
    public static void main(String[] args) {

        System.out.println("---------调用不带参数的构造函数-----------");
        RacingCar rcar1 = new RacingCar();
        rcar1.setCar(123, 20.5);
        rcar1.setCourse(5);
        System.out.println("---------调用带参数的构造函数-----------");
        RacingCar rcar2 = new RacingCar(22, 12.2, 66);
        System.out.println("---------newShow()-----------");
        rcar1.newShow();
        System.out.println("---------子类中的show()（重写）-----------");
        rcar2.show();
        System.out.println("---------用父类变量处理子类的对象-----------");
        Car_12_1 rcar3 = new RacingCar(3, 33.3, 33);
        rcar3.show();//此时调用的是子类中的show()，利用这一特性，可用数组批量处理对象
        System.out.println("---------调用toString()-----------");
        System.out.println(rcar1);
        System.out.println("---------调用equals()-----------");
        boolean bl1=rcar1.equals(rcar2);
        System.out.println("调用equals()比较了rcar1和rcar2,结果为 "+bl1);
        System.out.println("---------调用getClass()-----------");
        Car_12_1 rcar4 = new Car_12_1(4, 44.4);
        System.out.println("调用getClass()查询rcar1的所属类,结果为 "+rcar1.getClass());
        System.out.println("调用getClass()查询rcar2的所属类,结果为 "+rcar2.getClass());
        System.out.println("调用getClass()查询rcar3的所属类,结果为 "+rcar3.getClass());
        System.out.println("调用getClass()查询rcar4的所属类,结果为 "+rcar4.getClass());
    }
}
