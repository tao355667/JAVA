package Java_basic.chapt_11_NewClass._11_1_Extends.Sample2;

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

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("���ƺ�Ϊ" + num + "������Ϊ" + gas + "�ĳ��Ѿ���������");
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

    public RacingCar(int n, double g, int c) {
        super(n, g);
        course = c;
        System.out.println("�Ѵ���������·�ߺ�Ϊ" + course);
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("·�ߺ�����Ϊ" + course);
    }
}

public class Sample2 {
    /*
    ��super����ָ�����캯��
    һЩ���ͣ�
    this():�����������������캯��
    super():���������ĸ���Ĺ��캯��
    �ɽ���ͬ���ͻ������Ĳ������뺯�����Ե��ò�ͬ�Ĺ��캯�������أ�
     */
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar(1234, 20.5, 5);

    }
}

