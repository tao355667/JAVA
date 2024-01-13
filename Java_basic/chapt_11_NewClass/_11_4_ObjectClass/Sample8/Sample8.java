package Java_basic.chapt_11_NewClass._11_4_ObjectClass.Sample8;
/* 使用equals方法
当两个变量指向相同对象的时候，返回true，否则返回false
注意：不是将对象中的值进行比较
注意：String类中的equals()方法是查询两个对象表示的字符串是否相同，而不是看它们是否指向同一个对象
 */

//Car类
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
        System.out.println("车牌号定义为" + num + "，汽油量为" + gas);
    }

    public String toString() {
        String str="车牌号是"+num+"，汽油量是"+gas;
        return str;
    }

}

public class Sample8 {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();

        Car car3;
        car3=car1;

        boolean bl1=car1.equals(car2);
        boolean bl2=car1.equals(car3);

        System.out.println("查询了car1与car2是否相同，结果为"+bl1);
        System.out.println("查询了car1与car3是否相同，结果为"+bl2);
    }
}
