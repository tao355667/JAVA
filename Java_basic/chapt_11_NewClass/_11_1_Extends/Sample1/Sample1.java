package Java_basic.chapt_11_NewClass._11_1_Extends.Sample1;

/*
�������࣬���������ࣨ�̳г��ࣩ
 */
//Car��
class Car {
    private int num;//���ƺ�
    private double gas;//������

    public Car() {
        num = 0;
        gas = 0;
        System.out.println("������һ����");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("���ƺ�Ϊ" + num + "��������Ϊ" + gas);
    }

    public void show() {
        System.out.println("���ƺ���" + num);
        System.out.println("��������" + gas);
    }
}

//RacingCar��
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
}

public class Sample1 {
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar();
        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);
    }
}
