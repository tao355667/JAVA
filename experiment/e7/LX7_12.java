package experiment.e7;

class LX7_12 {
    static void mathodA() {
        try {
            System.out.println("\nmathodA �׳�һ���쳣");
            throw new RuntimeException();
        } finally {
            System.out.println("ִ�� mathodA �� finally");
        }
    }

    static void mathodB() {
        try {
            System.out.println("mathodB ��������");
            return;
        } finally {
            System.out.println("ִ�� mathodB �� finally");
        }
    }

    public static void main(String args[]) {
        try {
            mathodA();
        } catch (Exception e) {
            mathodB();
        }
    }
}
