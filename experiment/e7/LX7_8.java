package experiment.e7;

public class LX7_8 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("\na = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("�����˱� 0 ����" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("�����±�Խ�磺" + e);
        }
    }
}
