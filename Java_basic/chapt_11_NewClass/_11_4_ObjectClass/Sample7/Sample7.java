package Java_basic.chapt_11_NewClass._11_4_ObjectClass.Sample7;

/* ʹ��toString����
��������ʱ��ָ�����࣬�������Object��Ϊ����
Object�����Ҫ����
Boolean equals(Object obj)
Class getClass()
String toString()
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

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("���ƺŶ���Ϊ" + num + "��������Ϊ" + gas);
    }

    public String toString() {
        String str="���ƺ���"+num+"����������"+gas;
        return str;
    }

}

public class Sample7 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setCar(1234,20.5);
        System.out.println(car1);//�Զ�������toString����
    }
}
