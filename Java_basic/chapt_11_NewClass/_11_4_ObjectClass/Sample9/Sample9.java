package Java_basic.chapt_11_NewClass._11_4_ObjectClass.Sample9;

/* ʹ��getClass()����
getClass()�������ڷ��ض�����������
 */
//Car��
class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("������һ����");
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("����������");
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
            System.out.println("��" + (i + 1) + "�����������" + cl);
        }
    }
}
