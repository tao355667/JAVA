package experiment.e7;

public class LX7_11 {
    static void mathod() throws IllegalAccessException {
        System.out.println("\n 在 mathod 中抛出一个异常");
        throw new IllegalAccessException();
    }

    public static void main(String args[]) {
        try {
            mathod();
        } catch (IllegalAccessException e) {
            System.out.println("在 main 中捕获异常：" + e);
        }
    }
}
