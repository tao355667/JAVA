package experiment.e7;

public class LX7_9 {
    static void throwProcess() {
        try {
            throw new NullPointerException("��ָ���쳣");
        } catch (NullPointerException e) {
            System.out.println("\n �� throwProcess �����в���һ��" + e.getMessage());
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            throwProcess();
        } catch (NullPointerException e) {
            System.out.println("�ٴβ���" + e);
        }
    }
}