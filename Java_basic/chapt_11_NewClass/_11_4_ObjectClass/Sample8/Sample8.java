package Java_basic.chapt_11_NewClass._11_4_ObjectClass.Sample8;
/* ʹ��equals����
����������ָ����ͬ�����ʱ�򣬷���true�����򷵻�false
ע�⣺���ǽ������е�ֵ���бȽ�
ע�⣺String���е�equals()�����ǲ�ѯ���������ʾ���ַ����Ƿ���ͬ�������ǿ������Ƿ�ָ��ͬһ������
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

public class Sample8 {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();

        Car car3;
        car3=car1;

        boolean bl1=car1.equals(car2);
        boolean bl2=car1.equals(car3);

        System.out.println("��ѯ��car1��car2�Ƿ���ͬ�����Ϊ"+bl1);
        System.out.println("��ѯ��car1��car3�Ƿ���ͬ�����Ϊ"+bl2);
    }
}
