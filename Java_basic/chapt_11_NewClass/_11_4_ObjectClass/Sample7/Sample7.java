package Java_basic.chapt_11_NewClass._11_4_ObjectClass.Sample7;

/* 使用toString方法
若创建类时不指定父类，则该类以Object类为父类
Object类的主要方法
Boolean equals(Object obj)
Class getClass()
String toString()
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

public class Sample7 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setCar(1234,20.5);
        System.out.println(car1);//自动调用了toString方法
    }
}
