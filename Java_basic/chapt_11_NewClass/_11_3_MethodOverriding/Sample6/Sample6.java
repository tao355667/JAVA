package Java_basic.chapt_11_NewClass._11_3_MethodOverriding.Sample6;

/*
������д��Ӧ��
��ʹ�ø������飬���е����ÿ���ָ����Ҳ��ָ�����࣬
�����������ԣ�show()�����������е�show()����
�Ը��������ԣ�show()�����˸����е�show()����
�Ӷ�ʵʹ�������д������
����1��
    this�ɷ��ʱ����еĳ�Ա�ͷ���
    super�ɷ��ʸ����еĳ�Ա�ͷ���
����2��
    final�����ã���ʾ�����ɱ䡰
    eg1����ǰ��final��ʾ���಻�ɱ��̳�
    fg2������ǰ��final��ʾ�÷����޷�����д
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

public class Sample6 {
    public static void main(String[] args) {
        Car[] cars;
        cars =new Car[2];

        cars[0]=new Car();//������õ��Ǹ����show()����
        cars[0].setCar(1234,20.5);

        cars[1]=new RacingCar();//������õ��������show()����
        cars[1].setCar(4567,30.5);

        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}
