package experiment.e7;

public class LX7_11 {
    static void mathod() throws IllegalAccessException {
        System.out.println("\n �� mathod ���׳�һ���쳣");
        throw new IllegalAccessException();
    }

    public static void main(String args[]) {
        try {
            mathod();
        } catch (IllegalAccessException e) {
            System.out.println("�� main �в����쳣��" + e);
        }
    }
}
