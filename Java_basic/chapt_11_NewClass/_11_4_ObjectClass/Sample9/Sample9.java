package Java_basic.chapt_11_NewClass._11_4_ObjectClass.Sample9;

/* 使用getClass()方法
getClass()方法用于返回对象所属的类
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
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("创建了赛车");
    }
}

public class Sample9 {
    public static void main(String[] args) {
        Car[] cars;
        cars = new Car[2];

        cars[0] = new Car();
        cars[1] = new RacingCar();

        for (int i = 0; i < cars.length; i++) {
            Class cl = cars[i].getClass();
            System.out.println("第" + (i + 1) + "个对象的类是" + cl);
        }
    }
}
