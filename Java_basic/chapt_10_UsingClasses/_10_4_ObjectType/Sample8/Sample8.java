package Java_basic.chapt_10_UsingClasses._10_4_ObjectType.Sample8;

/*
P291 �ڲ�����ʹ�����ͱ���
 */
class Car {
    private int num;//ʹ���˻������ͱ�������
    private double gas;
    private String name;//ʹ�������ͱ�������

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("������һ����");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("���ƺ���" + num + "��������Ϊ" + gas);
    }

    public void setName(String name) {//�����͵ı�����Ϊ�޶������ķ���
        this.name = name;
        System.out.println("�����趨Ϊ" + name);
    }

    public void show() {
        System.out.println("���ƺ���" + num);
        System.out.println("��������" + gas);
        System.out.println("������" + name);
    }
}

public class Sample8 {
    public static void main(String[] args) {
        Car car1;//������car1
        car1 = new Car();
        car1.show();

        int number=1234;
        double gasoline=20.5;
        String str="1�ų�";

        car1.setCar(number,gasoline);
        car1.setName(str);//��ָ���ַ�������ı�����Ϊʵ�ʲ�����ָ��

        car1.show();
    }
}
