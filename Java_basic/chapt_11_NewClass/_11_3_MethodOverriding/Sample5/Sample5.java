package Java_basic.chapt_11_NewClass._11_3_MethodOverriding.Sample5;
/*
�ø���ı�����������Ķ���
������������е�show()������������
 */
class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("������һ����");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("���ƺ�Ϊ" + num + "��������Ϊ" + gas);
    }

    public void show() {//�÷����ᱻ��д
        System.out.println("���ƺ���" + num);
        System.out.println("��������" + gas);
    }
}

class RacingCar extends Car {
    private int course;//·�ߺ�

    public RacingCar() {
        course = 0;
        System.out.println("�Ѵ�������");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("·�ߺ�����Ϊ" + course);
    }

    public void show() {//������д
        System.out.println("�����ĳ��ƺ���" + num);
        System.out.println("��������������" + gas);
        System.out.println("������·�ߺ���" + course);
    }
}

public class Sample5 {
    public static void main(String[] args) {
        Car car1 = new RacingCar();
        car1.setCar(1234, 20.5);

        car1.show();//��Ȼ���õ�������ķ���
    }
}
