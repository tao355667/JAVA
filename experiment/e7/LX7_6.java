package experiment.e7;

public class LX7_6 {
    public static void main(String[] arg3) {
        System.out.println("����һ���쳣���������\n");
        try {
            int i = 10;
            i /= 0;
        } catch (ArithmeticException e) {
            System.out.println("�쳣�ǣ�" + e.getMessage());
        } finally {
            System.out.println("finally ��䱻ִ��");
        }
    }
}
